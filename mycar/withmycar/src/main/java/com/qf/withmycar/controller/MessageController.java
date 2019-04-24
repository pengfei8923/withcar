package com.qf.withmycar.controller;

import com.qf.withmycar.pojo.Message;
import com.qf.withmycar.service.MessageService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MessageController {

    private Long cid;//前端传回的参数

    @Autowired
    MessageService messageService;

//    展示消息
    @RequestMapping("/msglist")
    public String selectAllMessage(Model model){
        List<Message> messages = messageService.selectAllMessage();
        model.addAttribute("messages",messages);

//        System.out.println(messages);
        return "wk_msglist";
    }
    //    预览消息
    @RequestMapping("/msgshow")
    @ResponseBody
    public Boolean messageShow(/*Model model, */@RequestParam Long id){
//        System.out.println("id====="+id);
        cid = id;
        List<Message> messages = messageService.selectById(id);
//        if(messages != null){
//            System.out.println("msg==="+messages);
            return true;
//        }
//        model.addAttribute("messages",messages);
//        System.out.println("没有查到");
//        return false;
    }
    @RequestMapping("/msgshow2")
    public String messageShow(Model model){
//        System.out.println("cid===="+cid);
        List<Message> messages = messageService.selectById(cid);
        model.addAttribute("messages",messages);
//        System.out.println("msg2==="+messages);
        return "wk_msgshow";
    }
//    编辑消息
    @RequestMapping("/editmsg")
    @ResponseBody
    public Boolean messageEdit(/*Model model, */@RequestParam Long id){
//        System.out.println("id====="+id);
        cid = id;
        List<Message> messages = messageService.selectById(id);
//        if(messages != null){
//            System.out.println("msg==="+messages);
        return true;
//        }
//        model.addAttribute("messages",messages);
//        System.out.println("没有查到");
//        return false;
    }
    @RequestMapping("/editmsg2")
    public String messageEdit(Model model){
//        System.out.println("cid===="+cid);
        List<Message> messages = messageService.selectById(cid);
        model.addAttribute("messages",messages);
//        System.out.println("msg2==="+messages);
        return "wk_editmsg";
    }}
