package com.qf.withmycar.controller;

import com.qf.withmycar.pojo.CarModels;
import com.qf.withmycar.service.CarModelsService;
import com.qf.withmycar.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class CarModelsController {
    @Autowired
    CarModelsService carModelsService;

    @RequestMapping(value = "insertCarModels",method = RequestMethod.POST)
    public boolean insertCarModels(HttpServletRequest request, @RequestParam("realImg") MultipartFile file) throws IOException {
        String cmname = request.getParameter("cmname");
        String cmyear = request.getParameter("cmyear");
        Integer brandid = Integer.parseInt(request.getParameter("brandid"));
        Integer facid = Integer.parseInt(request.getParameter("facid"));
        Integer seriesid = Integer.parseInt(request.getParameter("seriesid"));
        Integer tyid = Integer.parseInt(request.getParameter("tyid"));
        Integer styid = Integer.parseInt(request.getParameter("styid"));
        String picurl = Util.FormData(file, request);
        CarModels carModels=new CarModels();
        carModels.setCmname(cmname);
        carModels.setCmyear(cmyear);
        carModels.setBrandid(brandid);
        carModels.setFacid(facid);
        carModels.setSeriesid(seriesid);
        carModels.setTyid(tyid);
        carModels.setStyid(styid);
        carModels.setPicurl(picurl);
        return carModelsService.insertCarModels(carModels);

    }

    /*查询所有车款*/
    @RequestMapping(value = "selectAllCarModelsDto",method = RequestMethod.POST)
    public Object selectAllCarModelsDto(){
        return carModelsService.selectAllCarModelsDto();
    }
    /*根据id查询车款*/
    @RequestMapping(value = "selectCarModelsById",method = RequestMethod.GET)
    public Object selectCarModelsById(@RequestParam Integer cmid){
        return carModelsService.selectCarModelsById(cmid);
    }
    /*修改车款信息*/
    @RequestMapping(value = "updateCarModels",method = RequestMethod.POST)
    public Object updateCarModels(@RequestBody CarModels carModels){
        return carModelsService.updateCarModels(carModels);
    }
    /*删除车款信息*/
    @RequestMapping(value = "deleteCarModels",method = RequestMethod.GET)
    public Object deleteCarModels(@RequestParam Integer cmid){
        return carModelsService.deleteCarModels(cmid);
    }
    /*模糊查询车款信息*/
    @RequestMapping(value = "selectCarModelsMohu",method = RequestMethod.POST)
    public Object selectCarModelsMohu(@RequestBody CarModels carModels){
        return carModelsService.selectCarModelsMohu(carModels);
    }
}
