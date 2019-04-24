package com.qf.withmycar.service;

import com.qf.withmycar.pojo.ActivityChannel;

import java.util.List;

/**
 * @Author:maxing @Date:2019/4/19
 */

public interface ActivityChannelService {
    //对活动渠道进行全查
    public List<ActivityChannel> selectActivityChannels();
    //新增一个活动渠道
    public int insertSelective(ActivityChannel record);
    //根据id查询活动渠道
    public ActivityChannel selectByPrimaryKey(Long id);
    //修改活动渠道
    public int updateByPrimaryKeySelective(ActivityChannel record);
    //根据id删除活动渠道
    public int deleteByPrimaryKey(Long id);
}
