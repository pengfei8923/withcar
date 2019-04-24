package com.qf.withcar.controller;

import com.qf.withcar.service.CardetailsService;
import com.qf.withmycar.pojo.CarModels;
import com.qf.withmycar.pojo.CarParamclass;
import com.qf.withmycar.pojo.CarSParamClass;
import com.qf.withmycar.vo.CardetailsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class CardetailsController {

    @Autowired
    CardetailsService cardetailsService;

    /**
     * 根据车款id查询
     * @param carid
     * @return
     */
    @RequestMapping(value = "queryCarSParamClassBycarid",method = RequestMethod.POST)
    @ResponseBody
    public List<CardetailsVo> queryCarSParamClassBycarid(@RequestParam Integer carid,@RequestParam Integer pacid) {
        List<CardetailsVo> cardetailsVos = cardetailsService.selectCarDetailsconfigByc(pacid,carid);
        return cardetailsVos;
    }

    /**
     * 根据参数类别id查询具体的参数
     * @return
     */
    @RequestMapping(value = "selectCarParamclass",method = RequestMethod.POST)
    @ResponseBody
   public List<CarParamclass> selectCarParamclass(){
        List<CarParamclass> paramclassList = cardetailsService.selectCarParamclass();
        return paramclassList;
    }

    /**
     * 根据id查询一条车款信息
     * @param cmid
     * @return
     */
    @RequestMapping(value = "selectCarModelsByIdlpf",method = RequestMethod.POST)
    @ResponseBody
    public CarModels selectCarModelsById(@RequestParam Integer cmid) {
        System.out.println(cmid);
        CarModels carModels = cardetailsService.selectCarModelsById(cmid);
        return carModels;
    }
}
