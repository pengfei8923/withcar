package com.qf.withcar.service.impl;

import com.qf.withcar.service.CarModelsService;
import com.qf.withmycar.mapper.CarModelsMapper;
import com.qf.withmycar.vo.CarModelBySeriesIdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarModelsServiceImpl implements CarModelsService {

    @Autowired
    private CarModelsMapper carModelsMapper;

    /*通过车系id查询所有车款的年款*/
    @Override
    @Transactional
    public List<String> getCarModelsYearBySeriesId(Integer seriesid) {
        List<String> list = carModelsMapper.getCarModelsYearBySeriesId(seriesid);
        return list;
    }
   /* 根据车系id查车款信息和厂商指导售价*/
    @Override
    @Transactional
    public List<CarModelBySeriesIdVo> getCarModelBySeriesId(Integer seriesid) {
        List<CarModelBySeriesIdVo> list = carModelsMapper.getCarModelBySeriesId(seriesid);
        return list;
    }
}
