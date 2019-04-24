package com.qf.withmycar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarGarageController {

    /*品牌管理*/
    @RequestMapping("/carbyfbrand")
    public String carbyfbrand(){
        return "byf_carbrand";
    }

    /*厂商管理*/
    @RequestMapping("/carbyfproducer")
    public String carbyfproducer(){
        return "byf_carproducer";
    }

    /*车系管理*/
    @RequestMapping("/carbyfseries")
    public String byfcarseries(){
        return "byf_carseries";
    }

    /*参数分类管理*/
    @RequestMapping("/carlpfbrand")
    public String carlpfbrand(){
        return "lpf_carbrand";
    }

    /*车款管理*/
    @RequestMapping("/carlpfmodels")
    public String carlpfmodels(){
        return "lpf_carmodels";
    }

    /*配置表*/
    @RequestMapping(value = "/carlpfmodelsconfig",method = RequestMethod.GET)
    public String carlpfmodelsconfig(@RequestParam Integer id, Model map){
        System.out.println(id);
        map.addAttribute("id",id);
        return "lpf_carmodelsconfig";
    }

    /*参数管理*/
    @RequestMapping("/carlpfparam")
    public String carlpfparam(){
        return "lpf_carparam";
    }


    /*自有商品管理*/
    @RequestMapping("/selfproducts")
    public String selfproducts(){
        return "wk_selfproducts";
    }

    /*消息管理
    @RequestMapping("/msglist")
    public String msglist(){
        return "wk_msglist";
    }
*/
}
