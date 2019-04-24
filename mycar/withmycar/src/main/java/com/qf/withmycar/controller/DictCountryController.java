package com.qf.withmycar.controller;

import com.qf.withmycar.service.DictCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DictCountryController {
    @Autowired
    DictCountryService dictCountryService;

    @RequestMapping(value = "selectAllCountries",method = RequestMethod.POST)
    @ResponseBody
    public Object selectAllCountries(){
        return dictCountryService.selectAllCountries();
    }
}
