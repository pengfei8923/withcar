package com.qf.withmycar.controller;

import com.qf.withmycar.pojo.CarSeries;
import com.qf.withmycar.service.CarSeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;

@RestController
public class CarSeriesController {
    @Autowired
    CarSeriesService carSeriesService;

    @RequestMapping(value = "addCarSeries",method = RequestMethod.POST)
    public boolean addCarSeries(@RequestBody CarSeries carSeries){
        carSeries.setCreateTime(new Date(new Timestamp(new Date().getTime()).getTime()));
        carSeries.setLastUpdate(new Date(new Timestamp(new Date().getTime()).getTime()));

        return carSeriesService.addCarSeries(carSeries);
    }
    /*查询所有车系信息*/
    @RequestMapping(value = "selectAllCarSeriesDto",method = RequestMethod.POST)
    public Object selectAllCarSeriesDto(){
        return carSeriesService.selectAllCarSeriesDto();
    }
    /*根据id查询一个车系信息*/
    @RequestMapping(value = "selectCarSeriesById",method = RequestMethod.GET)
    public Object selectCarSeriesById(@RequestParam Integer id){
        return carSeriesService.selectCarSeriesById(id);
    }
    /*修改车系信息*/
    @RequestMapping(value = "updateCarSeries",method = RequestMethod.POST)
    public Object updateCarSeries(@RequestBody CarSeries carSeries){
        return carSeriesService.updateCarSeries(carSeries);
    }
    /*删除车系信息*/
    @RequestMapping(value = "deleteCarSeries",method = RequestMethod.GET)
    public boolean deleteCarSeries(@RequestParam Integer id){
        return carSeriesService.deleteCarSeries(id);
    }
    /*模糊查询*/
    @RequestMapping(value = "selectCarSeriesByMohu",method = RequestMethod.POST)
    public Object selectCarSeriesByMohu(@RequestBody CarSeries carSeries){
        return carSeriesService.selectCarSeriesByMohu(carSeries);
    }
    /*根据厂商id查询车系信息*/
    @RequestMapping(value = "selectCarSeriesByFacId",method = RequestMethod.GET)
    public Object selectCarSeriesByFacId(@RequestParam Integer facId){
        return carSeriesService.selectCarSeriesByFacId(facId);
    }

    @RequestMapping(value = "selectTypeIdBySeriesId",method = RequestMethod.GET)
    public Object selectTypeIdBySeriesId(@RequestParam Integer id){
        return carSeriesService.selectTypeIdBySeriesId(id);
    }
}
