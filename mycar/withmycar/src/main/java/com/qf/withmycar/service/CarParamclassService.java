package com.qf.withmycar.service;

import com.qf.withmycar.pojo.CarParamclass;

import java.util.List;

/**
 * 参数类型
 */
public interface CarParamclassService {
    /*添加参数类型*/
    int addSelective(CarParamclass record);

    /*遍历参数类型*/
    List<CarParamclass> selectCarParamclass();

    /*根据id查询对应的参数类型*/
    CarParamclass selectByPrimaryKey(Integer pacid);

    /*修改参数类型*/
    int updateCarParamclassByPrimaryKey(CarParamclass record);

    /*根据id删除*/
    int deleteByPrimaryKey(Integer pacid);
}
