package com.qf.withcar.service.impl;

import com.qf.withcar.service.CardetailsService;
import com.qf.withmycar.mapper.CarSParamClassMapper;
import com.qf.withmycar.pojo.CarModels;
import com.qf.withmycar.pojo.CarParamclass;
import com.qf.withmycar.vo.CardetailsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.qf.withmycar.mapper.CarParamclassMapper;
import com.qf.withmycar.mapper.CarModelsMapper;

import java.util.List;

@Service
public class CardetailsServiceImpl implements CardetailsService {
    @Autowired
    CarSParamClassMapper carSParamClassMapper;

    @Autowired
    CarParamclassMapper carParamclassMapper;

    @Autowired
    CarModelsMapper carModelsMapper;

    /**
     * 前台查询参数配置
     * @param carid
     * @return
     */
    @Override
    @Transactional
    public List<CardetailsVo> selectCarDetailsconfigByc(int pacid,int carid) {
        List<CardetailsVo> cardetailsVos = carSParamClassMapper.selectCarDetailsconfigByc(pacid,carid);
        return cardetailsVos;
    }

    /**
     * 查询汽车参数分类
     * @return
     */
    @Override
    @Transactional
    public List<CarParamclass> selectCarParamclass() {
        List<CarParamclass> paramclassList = carParamclassMapper.selectCarParamclassBystate();
        return paramclassList;
    }

    /**
     * 根据id查询一条车款信息
     * @param cmid
     * @return
     */
    @Override
    @Transactional
    public CarModels selectCarModelsById(Integer cmid) {
        CarModels carModels = carModelsMapper.selectCarModelsById(cmid);
        return carModels;
    }


}
