package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.CarParamclass;

import java.util.List;

/**
 * 参数类型
 */
public interface CarParamclassMapper {

    /*根据id删除*/
    int deleteByPrimaryKey(Integer pacid);

    int insert(CarParamclass record);

    int insertSelective(CarParamclass record);

    CarParamclass selectByPrimaryKey(Integer pacid);

    /*修改参数类型*/
    int updateByPrimaryKeySelective(CarParamclass record);

    int updateByPrimaryKey(CarParamclass record);

    /*查询所有汽车分类*/
    List<CarParamclass> selectCarParamclass();
    /*查询生效的所有汽车分类*/
    List<CarParamclass> selectCarParamclassBystate();
}