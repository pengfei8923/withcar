package com.qf.withmycar.controller;

import com.qf.withmycar.pojo.CarSParamClass;
import com.qf.withmycar.service.CarSParamClassService;
import com.qf.withmycar.vo.Lpf_CarModelsConfig_VO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

@Controller
public class CarSParamClassController {

    @Autowired
    private CarSParamClassService carSParamClassService;

    /**
     * 查询所有车款对应的配置表格
     * @return
     */
    @RequestMapping("selectCarModelsConfig")
    @ResponseBody
    public LinkedHashMap<String, List<Lpf_CarModelsConfig_VO>> selectCarModelsConfig(){
        LinkedHashMap<String, List<Lpf_CarModelsConfig_VO>> map = carSParamClassService.selectCarModelsConfig();
        return map;
    }

    /**
     * 添加车款配置
     * @param carSParamClasses
     * @return
     */
    @RequestMapping("addCarSParamClass")
    @ResponseBody
    public Integer addCarSParamClass(@RequestBody List<CarSParamClass> carSParamClasses) {
        Integer a = carSParamClassService.addCarSParamClass(carSParamClasses);
        return a;
    }

    /**
     * 根据车款id查询
     * @param carid
     * @return
     */
    @RequestMapping("selectCarSParamClassBycarid")
    @ResponseBody
    public List<CarSParamClass> selectCarSParamClassBycarid(@RequestParam Integer carid) {
        List<CarSParamClass> list = carSParamClassService.selectByPrimaryKey(carid);
        return list;
    }

    /**
     * 修改车款参数
     * @param record
     * @return
     */
    @RequestMapping("updateCarSParamClass")
    @ResponseBody
    public Integer updateCarSParamClass(@RequestBody CarSParamClass record) {
        Integer integer = carSParamClassService.updateCarSParamClass(record);
        return integer;
    }
}
