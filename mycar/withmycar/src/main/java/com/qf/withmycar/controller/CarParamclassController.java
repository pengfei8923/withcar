package com.qf.withmycar.controller;

import com.qf.withmycar.pojo.CarParamclass;
import com.qf.withmycar.service.CarParamclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 参数类型
 */
@Controller
public class CarParamclassController {

    @Autowired
    private CarParamclassService carParamclassService;

    /**
     * 新增
     * @param record
     * @return
     */
    @RequestMapping("/addCarParamc")
    @ResponseBody
    public int addCarParamc(@RequestBody CarParamclass record){
        System.out.println(record);
        int i = carParamclassService.addSelective(record);
        return i;
    }

    /**
     * 查询所有汽车类型
     * @return
     */
    @RequestMapping("/selectCarParamclass")
    @ResponseBody
    public List<CarParamclass> selectCarParamclass() {
        List<CarParamclass> carParamclassList = carParamclassService.selectCarParamclass();
        return carParamclassList;
    }

    /**
     * 根据id查询汽车类型
     * @param pacid
     * @return
     */
    @RequestMapping("/getCarParamById")
    @ResponseBody
    public CarParamclass selectByPrimaryKey(@RequestParam Integer pacid) {
        CarParamclass carParamclass = carParamclassService.selectByPrimaryKey(pacid);
        return carParamclass;
    }

    /**
     * 修改汽车类型参数
     * @param record
     * @return
     */
    @RequestMapping("/updateCarParamclass")
    @ResponseBody
    public int updateCarParamclass(@RequestBody CarParamclass record) {
        int i = carParamclassService.updateCarParamclassByPrimaryKey(record);
        return i;
    }

    /**
     * 根据id删除汽车类型
     * @param pacid
     * @return
     */
    @RequestMapping("/lpfdeleteCarParamclass")
    @ResponseBody
    public int deleteByPrimaryKey(@RequestParam Integer pacid) {
        int i = carParamclassService.deleteByPrimaryKey(pacid);
        return i;
    }
}
