package com.qf.withcar.controller;

import com.qf.withcar.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class EmailController {
    @Autowired
    private EmailService emailService;
    @RequestMapping(value = "getCheckCode",method = RequestMethod.GET)
    @ResponseBody
    public String getCheckCode(@RequestParam("email") String email){
        System.out.println(email);
        String checkCode=String.valueOf(new Random().nextInt(899999) + 100000);
        String message = "欢迎使用伴我汽车app,您的注册验证码为："+checkCode+"，确认为本人操作";
        try {
            emailService.sendSimpleEmail(email,"伴我汽车注册验证码",message);
        }catch (Exception e){
            return "";
        }
        return checkCode;
    }
}
