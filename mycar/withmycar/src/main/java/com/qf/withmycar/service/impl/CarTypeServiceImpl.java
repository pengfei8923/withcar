package com.qf.withmycar.service.impl;

import com.qf.withmycar.mapper.CarTypeMapper;
import com.qf.withmycar.pojo.CarType;
import com.qf.withmycar.service.CarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarTypeServiceImpl implements CarTypeService {
    @Autowired
    CarTypeMapper carTypeMapper;
    @Override
    public List<CarType> selectAllCarTypes() {
        return carTypeMapper.selectAllCarTypes();
    }

    @Override
    public List<CarType> selectChildren(Integer tyid) {
        return carTypeMapper.selectChildren(tyid);
    }

    @Override
    public CarType selectTypeBySeries(Integer id) {
        return carTypeMapper.selectTypeBySeries(id);
    }

    @Override
    public List<CarType> selectAllChildrenTypes() {
        return carTypeMapper.selectAllChildrenTypes();
    }
}
