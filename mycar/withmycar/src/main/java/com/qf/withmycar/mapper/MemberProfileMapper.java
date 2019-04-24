package com.qf.withmycar.mapper;

import com.qf.withmycar.dto.CK_UserInfo;
import com.qf.withmycar.pojo.MemberProfile;
import com.qf.withmycar.vo.Ck_info;

import java.util.List;

public interface MemberProfileMapper {

    int deleteByPrimaryKey(Long id);


    int insert(MemberProfile record);


    int insertSelective(MemberProfile record);





    int updateByPrimaryKeySelective(MemberProfile record);


    int updateByPrimaryKey(MemberProfile record);

    CK_UserInfo selectByPrimaryKey(Long id);

    List<CK_UserInfo> getUserAll(int page);
    int getUserCount();

    List<CK_UserInfo> queryUserByInfo(Ck_info info);

    int getSeekUserCount(Ck_info info);


    //前台用
    MemberProfile selectMemberById(long id);
    /*加入member时查出id同时加入memberProfile*/
    public void insertMemberProfileWhenInsertMember(MemberProfile memberProfile);

}