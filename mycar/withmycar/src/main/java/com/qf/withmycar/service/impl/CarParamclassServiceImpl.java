package com.qf.withmycar.service.impl;

import com.qf.withmycar.mapper.CarParamclassMapper;
import com.qf.withmycar.pojo.CarParamclass;
import com.qf.withmycar.service.CarParamclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 参数类型
 */
@Service
public class CarParamclassServiceImpl implements CarParamclassService {
    @Autowired(required = false)
    private CarParamclassMapper carParamclassMapper;
    /*添加参数类型*/
    @Override
    @Transactional
    public int addSelective(CarParamclass record) {
        int a = carParamclassMapper.insertSelective(record);
        return a;
    }

    /*遍历参数类型*/
    @Override
    @Transactional
    public List<CarParamclass> selectCarParamclass() {
        List<CarParamclass> carParamclassList = carParamclassMapper.selectCarParamclass();
        return carParamclassList;
    }

    /*根据id查询对应的参数类型*/
    @Override
    @Transactional
    public CarParamclass selectByPrimaryKey(Integer pacid) {
        CarParamclass carParamclass = carParamclassMapper.selectByPrimaryKey(pacid);
        return carParamclass;
    }

    /*修改参数类型*/
    @Override
    @Transactional
    public int updateCarParamclassByPrimaryKey(CarParamclass record) {
        int i = carParamclassMapper.updateByPrimaryKeySelective(record);
        return i;
    }

    /*根据id删除*/
    @Override
    @Transactional
    public int deleteByPrimaryKey(Integer pacid) {
        int i = carParamclassMapper.deleteByPrimaryKey(pacid);
        return i;
    }
}
