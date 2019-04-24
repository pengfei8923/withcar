package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.Activity;

import java.util.List;

public interface ActivityMapper {

    public List<Activity> getUserActivity(long userId);
    public List<Activity> selectActivitys();//maxing

}