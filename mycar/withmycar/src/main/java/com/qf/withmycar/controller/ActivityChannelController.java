package com.qf.withmycar.controller;

import com.qf.withmycar.pojo.ActivityChannel;
import com.qf.withmycar.service.ActivityChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author:maxing @Date:2019/4/19
 */
@Controller
public class ActivityChannelController {
    @Autowired
    ActivityChannelService activityChannelService;
    @RequestMapping("activityRoadManager")
    public String activityRoadManager(Model model){
        List<ActivityChannel> activityChannels = activityChannelService.selectActivityChannels();
        model.addAttribute("channels",activityChannels);
        return "M_roadmanager";
    }
    //新增一个活动渠道
    @RequestMapping(value="addActivityRoad",method= RequestMethod.POST)
    @ResponseBody
    public int addActivityRoad(@RequestParam String roadName){
        //获取当前时间
        Date now=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
        String formatNow = dateFormat.format(now);
        String strNow=formatNow.replace("/","");
        int dataTime = Integer.parseInt(strNow);
        ActivityChannel activityChannel=new ActivityChannel();
        activityChannel.setCreateTime(dataTime);
        activityChannel.setUseCount("0");
        activityChannel.setName(roadName);
        int i = activityChannelService.insertSelective(activityChannel);
        return i;

    }
    //根据id查询活动渠道
    @RequestMapping(value="selectActivityChannelById",method= RequestMethod.GET)
    @ResponseBody
    public ActivityChannel selectActivityChannelById(@RequestParam long id){
        ActivityChannel activityChannel = activityChannelService.selectByPrimaryKey(id);
        return activityChannel;
    }
    //对编辑的活动渠道进行保存
    @RequestMapping(value="updateActivityChannelBy",method= RequestMethod.POST)
    @ResponseBody
    public int updateActivityChannelBy(@RequestBody ActivityChannel activityChannel){
        //获取当前时间
        Date now=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
        String formatNow = dateFormat.format(now);
        String strNow=formatNow.replace("/","");
        int dataTime = Integer.parseInt(strNow);
        activityChannel.setLastUpdateTime(dataTime);
        int i = activityChannelService.updateByPrimaryKeySelective(activityChannel);
        return i;
    }
    //根据id删除活动渠道
    @RequestMapping(value="delActivityChannelById",method= RequestMethod.GET)
    @ResponseBody
    public int delActivityChannelById(@RequestParam long id){
        int i = activityChannelService.deleteByPrimaryKey(id);
        return i;
    }
//查询所有渠道
    @RequestMapping(value="selectChannels",method= RequestMethod.POST)
    @ResponseBody
    public List<ActivityChannel> selectChannels(){
        return activityChannelService.selectActivityChannels();
    }
}
