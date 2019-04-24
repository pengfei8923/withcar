package com.qf.withmycar.service;

import com.qf.withmycar.pojo.Activity;
import com.qf.withmycar.pojo.ActivityCategory;
import com.qf.withmycar.pojo.ActivityState;

import java.util.List;

/**
 * @Author:maxing
 * @Date:2019/4/1314:52
 * @Version 1.0
 */

public interface ActivityListService {
    public List<ActivityCategory> selectActivityCategorys();
    public List<ActivityState> selectActivityStates();
    public List<Activity> selectActivitys();
    public int insertSelective(ActivityCategory record);//添加活动类型（部分字段）
    public ActivityCategory selectByPrimaryKey(Long id);//根据id查询活动类型
    public  int updateByPrimaryKeySelective(ActivityCategory record);//修改活动类型
    public int deleteByPrimaryKey(Long id);//删除一个活动类型
    public List<ActivityCategory> selectActivityCategoryLike(String name);//活动类型模糊查询
    public ActivityCategory selectActivityCategoryByName(String name);
}
