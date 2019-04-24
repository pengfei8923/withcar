package com.qf.withmycar.service;

import com.qf.withmycar.pojo.MemberPoint;

import java.util.List;

public interface UserPointService {

    public List<MemberPoint> getUserPointByUserId(long userId);
    public int getUserAllPoint(long userId);
}
