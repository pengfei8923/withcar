package com.qf.withmycar.mapper;

import com.qf.withmycar.dto.CarModelsDto;
import com.qf.withmycar.pojo.CarModels;
import com.qf.withmycar.vo.CarModelBySeriesIdVo;
import com.qf.withmycar.vo.CarSeriesModelsVo;

import java.util.List;

public interface CarModelsMapper {

    /*新增车款*/
    public void insertCarModels(CarModels carModels);
    /*查询所有车款*/
    public List<CarModelsDto>selectAllCarModelsDto();
    /*根据id查询一条车款信息*/
    public CarModels selectCarModelsById(Integer cmid);
    /*修改车款信息*/
    public void updateCarModels(CarModels carModels);
    /*删除车款信息*/
    public void deleteCarModels(Integer cmid);
    /*模糊查询车款信息*/
    public List<CarModelsDto>selectCarModelsMohu(CarModels carModels);
    /*通过车系id查询所有车款*/
    public List<CarModels>selectCarModelsBySeriesId(Integer seriesid);

    /*查询车款的最高价最低价*/
    public CarSeriesModelsVo selectPrice(Integer carid);

    //根据车系id查车款信息
    List<CarModels> queryCarModelBySeriesId(Integer id);

    /*通过车系id查询所有车款的年款*/
    public List<String> getCarModelsYearBySeriesId(Integer seriesid);
    //根据车系id查车款信息和厂商指导售价
    List<CarModelBySeriesIdVo> getCarModelBySeriesId(Integer seriesid);

}
