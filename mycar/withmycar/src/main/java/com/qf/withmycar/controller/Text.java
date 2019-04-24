package com.qf.withmycar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Text {

    @RequestMapping("/tt")
    public String tt(){
        return "tt";
    }
}
