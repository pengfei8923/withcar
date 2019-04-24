package com.qf.withmycar.service.impl;

import com.qf.withmycar.dto.CarSeriesDto;
import com.qf.withmycar.mapper.CarSeriesMapper;
import com.qf.withmycar.pojo.CarSeries;
import com.qf.withmycar.service.CarSeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class CarSeriesServiceImpl implements CarSeriesService {
    @Autowired
    CarSeriesMapper carSeriesMapper;

    @Override
    public boolean addCarSeries(CarSeries carSeries) {
        carSeriesMapper.addCarSeries(carSeries);
        return true;
    }

    @Override
    public List<CarSeriesDto> selectAllCarSeriesDto() {
        return carSeriesMapper.selectAllCarSeriesDto();
    }

    @Override
    public CarSeries selectCarSeriesById(Integer id) {
        return carSeriesMapper.selectCarSeriesById(id);
    }

    @Override
    public boolean updateCarSeries(CarSeries carSeries) {
        carSeries.setLastUpdate(new Date(new Timestamp(new Date().getTime()).getTime()));
        carSeriesMapper.updateCarSeries(carSeries);
        return true;
    }

    @Override
    public boolean deleteCarSeries(Integer id) {
        carSeriesMapper.deleteCarSeries(id);
        return true;
    }

    @Override
    public List<CarSeriesDto> selectCarSeriesByMohu(CarSeries carSeries) {
        return carSeriesMapper.selectCarSeriesByMohu(carSeries);
    }

    @Override
    public List<CarSeries> selectCarSeriesByFacId(Integer facId) {
        return carSeriesMapper.selectCarSeriesByFacId(facId);
    }

    @Override
    public Integer selectTypeIdBySeriesId(Integer id) {
        return carSeriesMapper.selectTypeIdBySeriesId(id);
    }
}
