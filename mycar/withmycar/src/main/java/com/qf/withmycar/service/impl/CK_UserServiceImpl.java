package com.qf.withmycar.service.impl;

import com.qf.withmycar.dto.CK_UserInfo;
import com.qf.withmycar.dto.Ck_UserCollect;
import com.qf.withmycar.mapper.ActivityMapper;
import com.qf.withmycar.mapper.MemberFavMapper;
import com.qf.withmycar.mapper.MemberProfileMapper;
import com.qf.withmycar.pojo.Activity;
import com.qf.withmycar.pojo.MemberProfile;
import com.qf.withmycar.service.CK_UserService;
import com.qf.withmycar.vo.Ck_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CK_UserServiceImpl implements CK_UserService {
    @Autowired(required = false)
    MemberProfileMapper memberProfile;
    @Autowired(required = false)
    ActivityMapper activityMapper;
    @Autowired
    MemberFavMapper memberFavMapper;

    @Override
    public List<CK_UserInfo> getAllUser(Integer page) {
//        memberProfile.
        return memberProfile.getUserAll(page);
    }
    @Override
    public int getUserCount() {
        //总页数
        int count = memberProfile.getUserCount();
        int pageNum= (int) Math.ceil(1.0 * count / 20);
        return pageNum;
    }

    @Override
    public List<CK_UserInfo> getUserInfoByInfo(Ck_info info) {

        return memberProfile.queryUserByInfo(info);
    }


    @Override
    public CK_UserInfo getUserInfoByUserId(long userId) {
        //根据id获取会员信息
        CK_UserInfo userInfo = this.memberProfile.selectByPrimaryKey(userId);
        return userInfo;
    }


//获取用户收藏的资讯
//    @Override
//    public List<Activity> getUserActivity(long userId) {
//        return activityMapper.getUserActivity(userId);
//    }
    //用户咨询
    @Override
    public List<Ck_UserCollect> getMyZiXun(long id) {
        return memberFavMapper.queryArticleByUserId(id);
    }
    //用户活动
    @Override
    public List<Ck_UserCollect> getMyHuoDong(long id) {
        return memberFavMapper.queryActiByUserId(id);
    }


    @Override
    public int getSeekUserCount(Ck_info info) {
        int seekUserCount = memberProfile.getSeekUserCount(info);
        int pageNum= (int) Math.ceil(1.0 * seekUserCount / 20);
        return pageNum;
    }



}
