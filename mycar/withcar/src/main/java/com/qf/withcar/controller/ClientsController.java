package com.qf.withcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ClientsController {

    @RequestMapping("/index")
    public String indexs() {
        System.out.println("111");
        return "/index";
    }
    @RequestMapping(value = "forum")
    public String forums() {
        return "/forum";
    }
    @RequestMapping(value = "myfavorite")
    public String myfavorites() {
        return "/my-favorite";
    }
    @RequestMapping(value = "servicelist")
    public String servicelists() {
        return "/service-list";
    }
    @RequestMapping(value = "my")
    public String mys() {
        return "/my";
    }
    @RequestMapping(value = "car_info")
    public String car_info() {
        return "/car_info";
    }
    @RequestMapping(value = "userlogin")
    public String userlogin() {
        return "/userlogin";
    }
    @RequestMapping(value = "selectbrand")
    public String selectbrand() {
        return "/selectbrand";
    }
    @RequestMapping(value = "selectcars")
    public String selectcars() {
        return "/selectcars";
    }
    @RequestMapping(value = "cardiscounts")
    public String cardiscounts() {
        return "/car_discounts";
    }

    /**
     * 车款详情
     * @return
     */
    @RequestMapping(value = "cardetails")
    public String cardetails(@RequestParam Integer carid, ModelMap map){
        map.addAttribute("ids",carid);
        return "/cardetails";
    }
    @RequestMapping(value = "carmessage")
    public String carmessage() {
        return "/car_message";
    }

    /**
     * 跳转车款
     * @return
     */
    @RequestMapping(value = "selectcarmodel")
    public String selectcarmodel(@RequestParam Integer id, ModelMap map) {
        map.addAttribute("ids",id);
        return "/selectcarmodel";
    }
    @RequestMapping(value = "userregister")
    public String userregister() {
        return "/userregister";
    }

    @RequestMapping(value = "userLogin")
    public String userLogin() {
        return "/userlogin";
    }


}
