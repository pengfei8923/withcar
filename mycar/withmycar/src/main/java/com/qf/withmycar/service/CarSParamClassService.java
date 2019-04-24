package com.qf.withmycar.service;

import com.qf.withmycar.pojo.CarSParamClass;
import com.qf.withmycar.vo.Lpf_CarModelsConfig_VO;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public interface CarSParamClassService {
    /**
     * 查询所有车款对应的配置表格
     * @return
     */
    LinkedHashMap<String, List<Lpf_CarModelsConfig_VO>> selectCarModelsConfig();

    /**
     * 添加车款配置
     * @param carSParamClasses
     * @return
     */
    Integer addCarSParamClass(List<CarSParamClass> carSParamClasses);

    /**
     * 根据车款id查询
     * @param carid 车款id
     * @return
     */
    List<CarSParamClass> selectByPrimaryKey(Integer carid);


    /**
     * 修改车款参数
     * @param record
     * @return
     */
    Integer updateCarSParamClass(CarSParamClass record);
}
