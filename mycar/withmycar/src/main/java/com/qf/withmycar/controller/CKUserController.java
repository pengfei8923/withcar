package com.qf.withmycar.controller;

import com.qf.withmycar.dto.CK_UserInfo;
import com.qf.withmycar.dto.Ck_UserCar;
import com.qf.withmycar.dto.Ck_UserCollect;
import com.qf.withmycar.pojo.*;
import com.qf.withmycar.service.CK_UserService;
import com.qf.withmycar.service.TagService;
import com.qf.withmycar.service.UserCarService;
import com.qf.withmycar.service.UserPointService;
import com.qf.withmycar.vo.Ck_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CKUserController {
    @Autowired
    CK_UserService userService;
    @Autowired
    TagService tagService;
    @Autowired
    UserCarService userCarService;
    @Autowired
    UserPointService pointService;


    //去往展示所有会员的页面  有分页 需要page参数
    @RequestMapping(value = "ck_userall")
    public String allUser(@RequestParam int page, Model map){
//        int page=0;
        System.out.println(page);
        List<CK_UserInfo> allUser = userService.getAllUser(page*20);
        int pageNum = userService.getUserCount();
        map.addAttribute("users",allUser);
        map.addAttribute("pageNum",pageNum);
        map.addAttribute("page",page+1);
        return "ck_userall";
    }
    //展示会员详情页 需要会员id
    @RequestMapping(value = "ck_userInfo")
    public String userInfo(@RequestParam long userId, Model map){
//        int userId = 1;
        CK_UserInfo userInfoByUserId = userService.getUserInfoByUserId(userId);
        //用户标签
        List<Tag> userTag = tagService.getUserTag(userId);
//        根据用户名查询用户拥有的座驾信息。
        List<Ck_UserCar> userCars = userCarService.getUserCar(userId);
        //积分
        List<MemberPoint> userPoints = pointService.getUserPointByUserId(userId);
        int allPoint=0;
        for (MemberPoint m:userPoints) {
            allPoint += m.getPoint();
        }
//为空会报异常
//        int allPoint = pointService.getUserAllPoint(userId);
        //收藏资讯
        List<Ck_UserCollect> userActivity = userService.getMyZiXun(userId);
        List<Ck_UserCollect> myHuoDong = userService.getMyHuoDong(userId);
//        System.out.println(userTag);
        map.addAttribute("userInfo",userInfoByUserId);
        map.addAttribute("userTag",userTag);
        map.addAttribute("userCars",userCars);
        map.addAttribute("userPoints",userPoints);
        map.addAttribute("allPoint",allPoint);
        map.addAttribute("myHuoDong",myHuoDong);
        map.addAttribute("userActivitys",userActivity);
        return "ck_userInfo";
    }
    //搜索框搜索内容 会员展示
    @RequestMapping(value = "getUserByInfo",method = RequestMethod.POST)
    @ResponseBody
    public String getUserByInfo(@RequestBody Ck_info info, HttpSession session){
//        System.out.println("getUserByInfo"+info);
        List<CK_UserInfo> byInfo = userService.getUserInfoByInfo(info);
        int pageNum = userService.getSeekUserCount(info);
//        System.out.println(pageNum);
//        map.addAttribute("users",byInfo);
//        map.addAttribute("pageNum",pageNum);
//        map.addAttribute("infos",info);
//        System.out.println("查询的结果list" +byInfo);
        session.setAttribute("byInfo",byInfo);
        session.setAttribute("pageNum",pageNum);
        session.setAttribute("infos",info);
        return "goSeekUser";
    }
    @RequestMapping(value = "goSeekUser")
    public String goSeekUser(Model map,HttpSession session){
        List<CK_UserInfo> byInfo =(List<CK_UserInfo>) session.getAttribute("byInfo");
        int pageNum = (int)session.getAttribute("pageNum");
        Ck_info infos =(Ck_info) session.getAttribute("infos");
        String time1 = infos.getTime1();
        String time2 = infos.getTime2();
//        System.out.println(time1.length()+"长度");
        if (time1.length()==8){
            StringBuilder sb = new StringBuilder(time1);
             sb.insert(4,'-');
             sb.insert(7,'-');
             infos.setTime1(sb.toString());
        }
        if (time2.length()==8){
            StringBuilder sb = new StringBuilder(time2);
            sb.insert(4,'-');
            sb.insert(7,'-');
            infos.setTime2(sb.toString());
        }
        Integer page = infos.getPage()+1;
        if(page%20 ==0){
            page=page/20;
        }else {
            page=page/20+1;
        }
//        System.out.println("****"+infos);
        map.addAttribute("users",byInfo);
        map.addAttribute("pageNum",pageNum);
        map.addAttribute("infos",infos);
        map.addAttribute("page",page);
        return "ck_seekuserall";
    }


}
