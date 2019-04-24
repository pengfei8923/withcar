package com.qf.withmycar.service.impl;

import com.qf.withmycar.mapper.ActivityChannelMapper;
import com.qf.withmycar.pojo.ActivityChannel;
import com.qf.withmycar.service.ActivityChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:maxing @Date:2019/4/19
 */
@Service
public class ActivityChannelServiceImpl implements ActivityChannelService {
   @Autowired
    ActivityChannelMapper activityChannelMapper;
    @Override
    public List<ActivityChannel> selectActivityChannels() {
        return activityChannelMapper.selectActivityChannels();
    }

    @Override
    public int insertSelective(ActivityChannel record) {
        int i = activityChannelMapper.insertSelective(record);
        return i;
    }

    @Override
    public ActivityChannel selectByPrimaryKey(Long id) {
        return  activityChannelMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ActivityChannel record) {
        return activityChannelMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        int i = activityChannelMapper.deleteByPrimaryKey(id);
        return i;
    }
}
