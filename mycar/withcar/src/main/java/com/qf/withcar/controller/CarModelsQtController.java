package com.qf.withcar.controller;

import com.qf.withcar.service.CarModelsService;
import com.qf.withmycar.vo.CarModelBySeriesIdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class CarModelsQtController {
    @Autowired
    private CarModelsService carModelsService;

    /*通过车系id查询所有车款的年款*/
    @RequestMapping(value = "getCarModelsYearBySeriesId",method = RequestMethod.POST)
    @ResponseBody
    public List<String> getCarModelsYearBySeriesId(@RequestParam Integer seriesid) {
        System.out.println(seriesid);
        List<String> list = carModelsService.getCarModelsYearBySeriesId(seriesid);
        return list;
    }
    /* 根据车系id查车款信息和厂商指导售价*/
    @RequestMapping(value = "getCarModelBySeriesId",method = RequestMethod.POST)
    @ResponseBody
    public List<CarModelBySeriesIdVo> getCarModelBySeriesId(@RequestParam Integer seriesid) {
        List<CarModelBySeriesIdVo> list = carModelsService.getCarModelBySeriesId(seriesid);
        return list;
    }
}
