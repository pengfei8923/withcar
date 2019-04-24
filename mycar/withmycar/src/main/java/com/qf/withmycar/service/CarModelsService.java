package com.qf.withmycar.service;

import com.qf.withmycar.dto.CarModelsDto;
import com.qf.withmycar.pojo.CarModels;

import java.util.List;

public interface CarModelsService {
    /*新增车款*/
    public boolean insertCarModels(CarModels carModels);
    /*查询所有车款*/
    public List<CarModelsDto> selectAllCarModelsDto();
    /*根据id查询一条车款信息*/
    public CarModels selectCarModelsById(Integer cmid);
    /*修改车系信息*/
    public boolean updateCarModels(CarModels carModels);
    /*删除车款信息*/
    public boolean deleteCarModels(Integer cmid);
    /*模糊查询车款信息*/
    public List<CarModelsDto>selectCarModelsMohu(CarModels carModels);
}
