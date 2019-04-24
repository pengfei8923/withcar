package com.qf.withmycar.controller;

import com.qf.withmycar.service.CarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarTypeController {
    @Autowired
    CarTypeService carTypeService;

    @RequestMapping(value = "selectAllCarTypes",method = RequestMethod.POST)
    public Object selectAllCarTypes(){
        return carTypeService.selectAllCarTypes();
    }

    @RequestMapping(value = "selectChildren",method = RequestMethod.GET)
    public Object selectChildren(@RequestParam Integer tyid){
        return carTypeService.selectChildren(tyid);
    }

    @RequestMapping(value = "selectTypeBySeries",method = RequestMethod.GET)
    public Object selectTypeBySeries(@RequestParam Integer id){
        return carTypeService.selectTypeBySeries(id);
    }

    @RequestMapping(value = "selectAllChildrenTypes",method = RequestMethod.POST)
    public Object selectAllChildrenTypes(){
        return carTypeService.selectAllChildrenTypes();
    }
}
