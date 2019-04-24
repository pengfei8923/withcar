package com.qf.withcar.service.impl;

import com.qf.withcar.service.UserService;
import com.qf.withmycar.mapper.MemberMapper;
import com.qf.withmycar.mapper.MemberProfileMapper;
import com.qf.withmycar.pojo.Member;
import com.qf.withmycar.pojo.MemberProfile;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    MemberProfileMapper memberProfileMapper;
    @Autowired(required = false)
    MemberMapper memberMapper;
    @Override
    public MemberProfile queryUserById(long userId) {
        return memberProfileMapper.selectMemberById(userId);
    }
    //用户信息修改
    @Override
    public void updateUserInfo(MemberProfile profile) {
        int i = memberProfileMapper.updateByPrimaryKeySelective(profile);
        System.out.println(i);
    }

    @Override
    public Member selectUserInfoByEmail(String useremail) {
        return memberMapper.selectUserInfoByEmail(useremail);
    }

    @Transactional
    @Override
    public boolean insertMemberAndMemberProfile(Member member) {
        String source=member.getPassword();
        String salt=member.getUseremail();
        Md5Hash md5Hash = new Md5Hash(source,salt,1024);
        System.out.println(md5Hash);
        member.setPassword(md5Hash.toString());
        System.out.println(md5Hash.toString());
        memberMapper.insertMember(member);
        System.out.println("impl:"+member);
        Member member1 = memberMapper.selectUserInfoByEmail(member.getUseremail());
        MemberProfile memberProfile=new MemberProfile();
        memberProfile.setId(member1.getId());
        memberProfile.setEmail(member1.getUseremail());
        memberProfileMapper.insertMemberProfileWhenInsertMember(memberProfile);
        return true;
    }

    @Override
    public Integer checkLogin(Member member, HttpSession session) {
        Member member1 = memberMapper.selectUserInfoByEmail(member.getUseremail());
        if (member1!=null) {
            String source = member.getPassword();
            String salt = member.getUseremail();
            Md5Hash md5Hash = new Md5Hash(source, salt, 1024);
            if (member1.getPassword().equals(md5Hash.toString())) {
                member1.setPassword(null);
                session.setAttribute("user",member1);
                return 1;
            }else {
                return -1;
            }
        }else {
            return 0;
        }
    }
}
