package com.qf.withmycar.service.impl;

import com.qf.withmycar.mapper.ActivityListMapper;
import com.qf.withmycar.mapper.ActivityMapper;
import com.qf.withmycar.pojo.Activity;
import com.qf.withmycar.pojo.ActivityCategory;
import com.qf.withmycar.pojo.ActivityState;
import com.qf.withmycar.service.ActivityListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:maxing
 * @Date:2019/4/1314:53
 * @Version 1.0
 */
@Service
public class ActivityListServiceImpl implements ActivityListService {
    @Autowired
    ActivityListMapper activityListMapper;
    @Autowired
    ActivityMapper activityMapper;
    @Override
    public List<ActivityCategory> selectActivityCategorys() {
        return activityListMapper.selectActivityCategorys();
    }

    @Override
    public List<ActivityState> selectActivityStates() {
        return activityListMapper.selectActivityStates();
    }

    @Override
    public List<Activity> selectActivitys() {
        return activityMapper.selectActivitys();
    }

    @Override
    public int insertSelective(ActivityCategory record) {
        int i = activityListMapper.insertSelective(record);
        return i;
    }

    @Override
    public ActivityCategory selectByPrimaryKey(Long id) {
        ActivityCategory activityCategory = activityListMapper.selectByPrimaryKey(id);
        return activityCategory;
    }

    @Override
    public int updateByPrimaryKeySelective(ActivityCategory record) {
        int i = activityListMapper.updateByPrimaryKeySelective(record);
        return i;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return activityListMapper.deleteByPrimaryKey(id);

    }

    @Override
    public List<ActivityCategory> selectActivityCategoryLike(String name) {
        return activityListMapper.selectActivityCategoryLike(name);
    }

    @Override
    public ActivityCategory selectActivityCategoryByName(String name) {
        return activityListMapper.selectActivityCategoryByName(name);
    }
}
