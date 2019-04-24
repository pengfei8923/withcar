package com.qf.withmycar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("clients")
public class ClientsController {

    @RequestMapping(value = "")
    public String indexs() {
        return "/clients/index";
    }
    @RequestMapping(value = "forum")
    public String forums() {
        return "/clients/forum";
    }
    @RequestMapping(value = "myfavorite")
    public String myfavorites() {
        return "/clients/my-favorite";
    }
    @RequestMapping(value = "servicelist")
    public String servicelists() {
        return "/clients/service-list";
    }
    @RequestMapping(value = "my")
    public String mys() {
        return "/clients/my";
    }
}
