package com.qf.withcar.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ck_UserLoginController {


    @RequestMapping("/delLogin")
    public Object UserLogin(String username,String password){

        try {
            Subject subject = SecurityUtils.getSubject();//从安全管理器中获取主体对象
            UsernamePasswordToken token = new UsernamePasswordToken(username,password);//构建令牌对象
//            token.setUsername(username);//赋身份信息
//            token.setPassword(password.toCharArray());//赋凭证信息
            subject.login(token);//使用主体的login方法判定用户的权限
            if(subject.isAuthenticated()){
                //        已登陆
                //        用户信息及权限信息的存储（session|| redis）
                return "/index";
            }
        } catch (AuthenticationException e) {
            e.printStackTrace();
            System.out.println("登录失败");

        }
        return "unauth";//异常界面
//        return "login";
    }

}
