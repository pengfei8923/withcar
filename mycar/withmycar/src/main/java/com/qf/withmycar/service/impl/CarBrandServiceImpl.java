package com.qf.withmycar.service.impl;

import com.qf.withmycar.mapper.CarBrandMapper;
import com.qf.withmycar.pojo.CarBrand;
import com.qf.withmycar.service.CarBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarBrandServiceImpl implements CarBrandService {
    @Autowired
    CarBrandMapper carBrandMapper;
    @Override
    public boolean insertSelective(CarBrand record) {
        carBrandMapper.insertSelective(record);
        return true;
    }

    @Override
    public List<CarBrand> selectAllBrands() {
        return carBrandMapper.selectAllBrands();
    }

    @Override
    public CarBrand selectByPrimaryKey(Integer id) {
        return carBrandMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(CarBrand record) {
        carBrandMapper.updateByPrimaryKeySelective(record);
        return true;
    }

    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        carBrandMapper.deleteByPrimaryKey(id);
        return true;
    }

    @Override
    public List<CarBrand> mohu(CarBrand carBrand) {
        return carBrandMapper.mohu(carBrand);
    }


}
