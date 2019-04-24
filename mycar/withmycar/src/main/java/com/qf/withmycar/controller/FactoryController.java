package com.qf.withmycar.controller;

import com.qf.withmycar.pojo.CarBrand;
import com.qf.withmycar.pojo.Factory;
import com.qf.withmycar.service.FactoryService;
import com.qf.withmycar.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

@RestController
public class FactoryController {
    @Autowired
    FactoryService factoryService;

    @RequestMapping(value = "addFactory",method = RequestMethod.POST)
    public boolean addFactory(HttpServletRequest request,@RequestParam("realImg") MultipartFile file) throws IOException {
        String facName = request.getParameter("facName");
        String brandId = request.getParameter("brandId");
        String picLoc = Util.FormData(file, request);
        Date date = new Date(new Timestamp(new Date().getTime()).getTime());
        Factory factory = new Factory();
        factory.setFacLogo(picLoc);
        factory.setFacName(facName);
        factory.setBrandId(Integer.parseInt(brandId));
        factory.setCreateTime(date);
        factory.setLastUpdate(date);
        return factoryService.addFactory(factory);
    }

    @RequestMapping(value = "selectAllFactory",method = RequestMethod.POST)
    public Object selectAllFactory(){
        return factoryService.selectAllFactory();
    }

    /*厂商信息页展示*/
    @RequestMapping(value = "selectAllBrandFactoryDto",method = RequestMethod.POST)
    public Object selectAllBrandFactoryDto(){
        return factoryService.selectAllBrandFactoryDto();
    }

    @RequestMapping(value = "selectFactoryById",method = RequestMethod.GET)
    public Object selectFactoryById(@RequestParam Integer facId){
        return factoryService.selectFactoryById(facId);
    }

    @RequestMapping(value = "updateFactory",method = RequestMethod.POST)
    public boolean updateFactory(HttpServletRequest request, @RequestParam("realImg1")MultipartFile file) throws IOException {
        String facName = request.getParameter("facName");
        Integer brandId = Integer.parseInt(request.getParameter("brandId"));
        Integer facId = Integer.parseInt(request.getParameter("facId"));
        String picLoc = Util.FormData(file, request);
        Factory factory=new Factory();
        factory.setFacId(facId);
        factory.setFacName(facName);
        factory.setBrandId(brandId);
        factory.setFacLogo(picLoc);
        factory.setLastUpdate(new Date(new Timestamp(new Date().getTime()).getTime()));
        return factoryService.updateFactory(factory);
        //return true;
    }

    @RequestMapping(value = "deleteFactory",method = RequestMethod.GET)
    public boolean deleteFactory(@RequestParam("facId")Integer facId){
        return factoryService.deleteFactory(facId);
    }

    @RequestMapping(value = "factoryMohu",method = RequestMethod.GET)
    public Object factoryMohu(@RequestParam Integer brandId,@RequestParam String facName){
        Factory factory=new Factory();
        factory.setBrandId(brandId);
        factory.setFacName(facName);
        return factoryService.factoryMohu(factory);
    }

    @RequestMapping(value = "selectFactoryBybrandId",method = RequestMethod.GET)
    public Object selectFactoryBybrandId(@RequestParam Integer brandId){
        return factoryService.selectFactoryBybrandId(brandId);
    }
}
