package com.qf.withcar.service;

import com.qf.withmycar.pojo.CarModels;
import com.qf.withmycar.pojo.CarParamclass;
import com.qf.withmycar.pojo.CarSParamClass;
import com.qf.withmycar.vo.CardetailsVo;

import java.util.List;

public interface CardetailsService {

    /**
     * 前台查询参数配置
     * @param carid
     * @return
     */
    List<CardetailsVo> selectCarDetailsconfigByc(int carid,int pacid);


    /**
     * 查询汽车参数分类
     * @return
     */
    List<CarParamclass> selectCarParamclass();


    /*根据id查询一条车款信息*/
    public CarModels selectCarModelsById(Integer cmid);
}
