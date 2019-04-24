package com.qf.withcar.controller;

import com.qf.withcar.service.UserService;
import com.qf.withmycar.pojo.Member;
import com.qf.withmycar.pojo.MemberProfile;
import com.qf.withmycar.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("getUserInfo")
    public String getUserInfo( HttpSession session, Model map){
        long userId=1;//用户id,member Id
        System.out.println("getUserInfo"+userId);
//根据用户id 查询用户信息，从个人中心页面过来 personalcenter.html
        MemberProfile memberProfile = userService.queryUserById(userId);
//        userinfo.html 用户详情页
        map.addAttribute("user",memberProfile);
        session.setAttribute("userinfo",memberProfile);
        return "userinfo";
    }
    @RequestMapping("userHead")
    public String userHead(Model map,HttpSession session){
//去修改用户昵称页面
        MemberProfile userinfo = (MemberProfile)session.getAttribute("userinfo");
        String userHead = userinfo.getAvatarUrl();
        map.addAttribute("userHead",userHead);
        return "userhead";
    }

    @RequestMapping("nickname")
    public String nickname(Model map,HttpSession session){
//去修改用户昵称页面
        MemberProfile userinfo = (MemberProfile)session.getAttribute("userinfo");
        String nickname = userinfo.getNickname();
        map.addAttribute("nickname",nickname);
        return "usernickname";
    }

    @RequestMapping("mobile")
    public String mobile(Model map,HttpSession session){
//去修改用户电话  放一放。。。
        MemberProfile userinfo = (MemberProfile)session.getAttribute("userinfo");
        String mobile = userinfo.getMobile();
        map.addAttribute("mobile",mobile);
        return "usertel";
    }

    @RequestMapping("name")
    public String name(Model map,HttpSession session){
//去修改用户真实姓名
        MemberProfile userinfo = (MemberProfile)session.getAttribute("userinfo");
        String name = userinfo.getName();
        map.addAttribute("name",name);
        return "username";
    }

    @RequestMapping("gender")
    public String gender(Model map,HttpSession session){
//去修改用户性别
//        MemberProfile userinfo = (MemberProfile)session.getAttribute("userinfo");
//        Byte gender = userinfo.getGender();
//        map.addAttribute("gender",gender);
        return "usergender";
    }

    @RequestMapping("email")
    public String email(Model map,HttpSession session){
//去修改用户邮箱
        MemberProfile userinfo = (MemberProfile)session.getAttribute("userinfo");
        String email = userinfo.getEmail();
        map.addAttribute("email",email);
        return "useremail";
    }
    @RequestMapping("address")
    public String address(Model map,HttpSession session){
//去修改用户地址
        MemberProfile userinfo = (MemberProfile)session.getAttribute("userinfo");
        String address = userinfo.getAddress();
        map.addAttribute("address",address);
        return "useraddress";
    }

    @RequestMapping(value = "updateName",method = RequestMethod.POST)
    @ResponseBody
    public long updateNickname(@RequestBody MemberProfile profile,  HttpSession session){
        System.out.println(profile);
        MemberProfile userinfo = (MemberProfile)session.getAttribute("userinfo");
        profile.setId(userinfo.getId());
        userService.updateUserInfo(profile);
        return userinfo.getId();
    }

    @RequestMapping(value = "updateUserHead",method = RequestMethod.POST)
    @ResponseBody
    public long updateUserHead(@RequestParam("realImg") MultipartFile file, HttpServletRequest request, HttpSession session) throws IOException {
        System.out.println(file);
        MemberProfile userinfo = (MemberProfile)session.getAttribute("userinfo");
        String picurl = Util.FormData(file, request);
        MemberProfile profile = new MemberProfile();
        profile.setId(userinfo.getId());
        profile.setAvatarUrl(picurl);
        userService.updateUserInfo(profile);
        return userinfo.getId();
    }

    @RequestMapping(value = "selectUserInfoByEmail",method = RequestMethod.GET)
    @ResponseBody
    public Object selectUserInfoByEmail(@RequestParam String useremail){
        Member member = userService.selectUserInfoByEmail(useremail);
        if (member!=null){
            return member;
        }else {
            return 0;
        }
    }

    @RequestMapping(value = "insertUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public Object insertMemberAndMemberProfile(@RequestBody Member member){
        System.out.println("controller"+member);
       return userService.insertMemberAndMemberProfile(member);
    }

    @RequestMapping(value = "checkLogin",method = RequestMethod.POST)
    @ResponseBody
    public Object checkLogin(@RequestBody Member member,HttpSession session){
       return userService.checkLogin(member,session);
    }

    @RequestMapping(value = "gerUserInfo",method = RequestMethod.POST)
    @ResponseBody
    public Object gerUserInfo(HttpSession session){
        return session.getAttribute("user");
    }

}
