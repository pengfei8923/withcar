package com.qf.withmycar.service;

import com.qf.withmycar.pojo.CarType;

import java.util.List;

public interface CarTypeService {
    /*查询所有汽车一级类型*/
    public List<CarType> selectAllCarTypes();
    /*查询一个主类型下的所有子类型*/
    public List<CarType> selectChildren(Integer tyid);
    /*根据车系id查询当前的类型id和类型名称*/
    public CarType selectTypeBySeries(Integer id);
    /*查询出所有二级类型*/
    public List<CarType> selectAllChildrenTypes();
}
