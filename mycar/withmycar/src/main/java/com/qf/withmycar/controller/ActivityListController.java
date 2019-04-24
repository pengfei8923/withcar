package com.qf.withmycar.controller;

import com.qf.withmycar.pojo.Activity;
import com.qf.withmycar.pojo.ActivityCategory;
import com.qf.withmycar.pojo.ActivityState;
import com.qf.withmycar.service.ActivityListService;
import com.qf.withmycar.vo.ActivityVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author:maxing
 * @Date:2019/4/1315:00
 * @Version 1.0
 */
@Controller
public class ActivityListController {
   @Autowired
   ActivityListService activityListService;

    @RequestMapping("selectActivityList")
    public String selectActivityCategory(Model model){
        List<ActivityCategory> activityCategories = activityListService.selectActivityCategorys();
        List<ActivityState> activityStates = activityListService.selectActivityStates();
        List<Activity> activityList = activityListService.selectActivitys();
        model.addAttribute("categorys",activityCategories);
        model.addAttribute("activityStates",activityStates);
        model.addAttribute("lists",activityList);

        return "M_activitylist";
    }
    @RequestMapping("addActivity")
    public String addActivity(Model model){
        List<ActivityCategory> activityCategories = activityListService.selectActivityCategorys();
        model.addAttribute("categorys",activityCategories);

        return "M_addactivity";
    }

    @RequestMapping("activityTypeManager")
    public String addActivity2(Model model){
        List<ActivityCategory> activityCategories = activityListService.selectActivityCategorys();
        model.addAttribute("categorys",activityCategories);
        return "M_typemanager";
    }

    @RequestMapping(value="addOneActivity",method= RequestMethod.POST)
    @ResponseBody
    public int addActivity(@RequestBody ActivityVo activityVo){
        System.out.println(activityVo);
        String title=activityVo.getTitle();
        String activityType = activityVo.getActivityType();
        ActivityCategory activityCategory = activityListService.selectActivityCategoryByName(activityType);
        Long id = activityCategory.getId();



        String createName = activityVo.getCreateName();
        String startTime = activityVo.getStartTime();

        String endTime = activityVo.getEndTime();
        String activityLink = activityVo.getActivityLink();
        String coverPic = activityVo.getCoverPic();
        String cars = activityVo.getCars();


        return 1;
    }
//新增活动类型
    @RequestMapping(value="addActivityType",method= RequestMethod.POST)
    @ResponseBody
    public int addActivityType(@RequestParam String typeName){
       // System.out.println(typeName);
        //获取当前时间
        Date now=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
        String formatNow = dateFormat.format(now);
        String strNow=formatNow.replace("/","");
        int dataTime = Integer.parseInt(strNow);
        ActivityCategory activityCategory=new ActivityCategory();
        activityCategory.setCreateTime(dataTime);
        activityCategory.setName(typeName);
        activityCategory.setUseCount("0");
        int i = activityListService.insertSelective(activityCategory);
        return i;
    }
    //根据id查询活动类型
    @RequestMapping(value="selectActivityCategoryById",method= RequestMethod.GET)
    @ResponseBody
    public ActivityCategory selectActivityCategoryById(@RequestParam long id){
        ActivityCategory activityCategory = activityListService.selectByPrimaryKey(id);
        return activityCategory;
    }
//修改活动类型
    @RequestMapping(value="updateActivityCategoryBy",method= RequestMethod.POST)
    @ResponseBody
    public int updateActivityCategoryBy(@RequestBody ActivityCategory activityCategory){
        Date now=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
        String formatNow = dateFormat.format(now);
        String strNow=formatNow.replace("/","");
        int dataTime = Integer.parseInt(strNow);
        activityCategory.setLastUpdateTime(dataTime);
        int i = activityListService.updateByPrimaryKeySelective(activityCategory);
        return i;
    }
    //删除活动类型
    @RequestMapping(value="delActivityCategoryById",method= RequestMethod.GET)
    @ResponseBody
    public int delActivityCategoryById(@RequestParam long id){
        System.out.println(id);
        int i = activityListService.deleteByPrimaryKey(id);
        return i;
    }
    //模糊查询
    @RequestMapping(value="selectActivityCategoryLike",method= RequestMethod.GET)
    @ResponseBody
    public List<ActivityCategory> selectActivityCategoryLike(@RequestParam String name)throws UnsupportedEncodingException {

        String decodeName = URLDecoder.decode(name, "UTF-8");
        System.out.println(decodeName);
        return activityListService.selectActivityCategoryLike(decodeName);
    }
}
