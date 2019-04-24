package com.qf.withcar.controller;

import com.qf.withmycar.pojo.CarIntelligence;
import com.qf.withcar.service.CarIntelligenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CarIntelligenceController {
    @Autowired
    CarIntelligenceService carIntelligenceService;
    //全查
    @RequestMapping(value = "/findAllIntelligence",method = RequestMethod.GET)
    @ResponseBody
    public List<CarIntelligence> findAllIntelligence(){
        return carIntelligenceService.findAllIntelligence();
    }

    //标签查询
    @RequestMapping(value="/selectMohu",method=RequestMethod.POST)
    @ResponseBody
    public Object selectMohu(@RequestParam String carSpan){
        System.out.println(carSpan);
        return carIntelligenceService.selectMohu(carSpan);
    }

 //名字模糊
    @RequestMapping(value = "/selectMohuByName",method = RequestMethod.POST)
    @ResponseBody
    public Object selectMohuByName(@RequestParam String carName){
        return carIntelligenceService.selectMohuByName(carName);
    }
    @RequestMapping("car_message")
    public String car_message(){
        return "car_message";
    }
}
