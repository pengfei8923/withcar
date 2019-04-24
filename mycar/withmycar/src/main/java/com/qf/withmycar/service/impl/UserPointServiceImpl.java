package com.qf.withmycar.service.impl;

import com.qf.withmycar.mapper.MemberPointMapper;
import com.qf.withmycar.pojo.MemberPoint;
import com.qf.withmycar.service.UserPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserPointServiceImpl implements UserPointService {
    @Autowired(required = false)
    MemberPointMapper memberPointMapper;
    @Override
    public List<MemberPoint> getUserPointByUserId(long userId) {
        return memberPointMapper.selectByMemberId(userId);
    }

    @Override
    public int getUserAllPoint(long userId) {
        return memberPointMapper.selectUserAllPoint(userId);
    }
}
