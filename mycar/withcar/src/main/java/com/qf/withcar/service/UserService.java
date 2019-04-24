package com.qf.withcar.service;


import com.qf.withmycar.pojo.Member;
import com.qf.withmycar.pojo.MemberProfile;

import javax.servlet.http.HttpSession;

public interface UserService {

    public MemberProfile queryUserById(long userId);
    public void updateUserInfo(MemberProfile profile);

    public Member selectUserInfoByEmail(String useremail);

    /*将用户插入member中*/
    public boolean insertMemberAndMemberProfile(Member member);
    /*登录*/
    public Integer checkLogin(Member member, HttpSession session);
}
