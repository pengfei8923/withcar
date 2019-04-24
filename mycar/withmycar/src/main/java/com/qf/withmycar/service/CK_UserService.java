package com.qf.withmycar.service;

import com.qf.withmycar.dto.CK_UserInfo;
import com.qf.withmycar.dto.Ck_UserCollect;
import com.qf.withmycar.pojo.Activity;
import com.qf.withmycar.vo.Ck_info;

import java.util.List;

public interface CK_UserService {

    public List<CK_UserInfo> getAllUser(Integer page);
    public CK_UserInfo getUserInfoByUserId(long userId);
    public int getUserCount();
    public List<CK_UserInfo> getUserInfoByInfo(Ck_info info);


    public List<Ck_UserCollect> getMyZiXun(long userId);
    public List<Ck_UserCollect> getMyHuoDong(long userId);
    public int getSeekUserCount(Ck_info info);


}
