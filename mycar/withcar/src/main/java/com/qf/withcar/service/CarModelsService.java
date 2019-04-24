package com.qf.withcar.service;

import com.qf.withmycar.vo.CarModelBySeriesIdVo;

import java.util.List;

public interface CarModelsService {
    /*通过车系id查询所有车款的年款*/
    public List<String> getCarModelsYearBySeriesId(Integer seriesid);
    //根据车系id查车款信息和厂商指导售价
    List<CarModelBySeriesIdVo> getCarModelBySeriesId(Integer seriesid);
}
