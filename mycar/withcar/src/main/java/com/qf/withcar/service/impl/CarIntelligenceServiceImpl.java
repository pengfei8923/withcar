package com.qf.withcar.service.impl;

import com.qf.withmycar.mapper.CarIntelligenceMapper;
import com.qf.withcar.service.CarIntelligenceService;
import com.qf.withmycar.pojo.CarIntelligence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarIntelligenceServiceImpl implements CarIntelligenceService {
    @Autowired(required=false)
    CarIntelligenceMapper carIntelligenceMapper;
    @Override
    public List<CarIntelligence> findAllIntelligence() {

        return carIntelligenceMapper.findAllIntelligence();
    }

    @Override
    public List<CarIntelligence> selectMohu(String carSpan) {

        return carIntelligenceMapper.selectMohu(carSpan);
    }

    @Override
    public List<CarIntelligence> selectMohuByName(String carName) {
        return carIntelligenceMapper.selectMohuByName(carName);
    }
}
