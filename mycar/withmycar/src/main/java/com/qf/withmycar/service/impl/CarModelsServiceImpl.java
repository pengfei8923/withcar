package com.qf.withmycar.service.impl;

import com.qf.withmycar.dto.CarModelsDto;
import com.qf.withmycar.mapper.CarModelsMapper;
import com.qf.withmycar.pojo.CarModels;
import com.qf.withmycar.service.CarModelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class CarModelsServiceImpl implements CarModelsService {
    @Autowired
    CarModelsMapper carModelsMapper;
    @Override
    public boolean insertCarModels(CarModels carModels) {
        Date time = new Date(new Timestamp(new Date().getTime()).getTime());
        carModels.setCreatetime(time);
        carModels.setLastupdate(time);
        carModelsMapper.insertCarModels(carModels);
        return true;
    }

    @Override
    public List<CarModelsDto> selectAllCarModelsDto() {
        return carModelsMapper.selectAllCarModelsDto();
    }

    @Override
    public CarModels selectCarModelsById(Integer cmid) {
        return carModelsMapper.selectCarModelsById(cmid);
    }

    @Override
    public boolean updateCarModels(CarModels carModels) {
        carModels.setLastupdate(new Date(new Timestamp(new Date().getTime()).getTime()));
        carModelsMapper.updateCarModels(carModels);
        return true;
    }

    @Override
    public boolean deleteCarModels(Integer cmid) {
        carModelsMapper.deleteCarModels(cmid);
        return true;
    }

    @Override
    public List<CarModelsDto> selectCarModelsMohu(CarModels carModels) {
        return carModelsMapper.selectCarModelsMohu(carModels);
    }
}
