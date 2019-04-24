package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.Member;

public interface MemberMapper {
    public Member selectUserInfoByEmail(String useremail);
    /*将用户插入member中*/
    public void insertMember(Member member);
}