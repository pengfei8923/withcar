package com.qf.withmycar.mapper;

import com.qf.withmycar.dto.CarSeriesDto;
import com.qf.withmycar.pojo.CarSeries;

import java.util.List;

public interface CarSeriesMapper {
    /*新增车系*/
    public void addCarSeries(CarSeries carSeries);
    /*查询所有车系*/
    public List<CarSeriesDto>selectAllCarSeriesDto();
    /*根据id查询一个车系信息*/
    public CarSeries selectCarSeriesById(Integer id);
    /*修改车系信息*/
    public void updateCarSeries(CarSeries carSeries);
    /*删除车系信息*/
    public void deleteCarSeries(Integer id);
    /*模糊查询*/
    public List<CarSeriesDto> selectCarSeriesByMohu(CarSeries carSeries);
    /*根据facId查询车系信息*/
    public List<CarSeries> selectCarSeriesByFacId(Integer facId);
    /*根据车系id查询车系的主类型*/
    public Integer selectTypeIdBySeriesId(Integer id);
}
