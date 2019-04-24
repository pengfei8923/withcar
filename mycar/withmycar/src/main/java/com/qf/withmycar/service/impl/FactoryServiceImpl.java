package com.qf.withmycar.service.impl;

import com.qf.withmycar.dto.Brand_FactoryDto;
import com.qf.withmycar.mapper.FactoryMapper;
import com.qf.withmycar.pojo.Factory;
import com.qf.withmycar.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactoryServiceImpl implements FactoryService {
    @Autowired
    FactoryMapper factoryMapper;
    @Override
    public boolean addFactory(Factory factory) {
        factoryMapper.addFactory(factory);
        return true;
    }

    @Override
    public List<Factory> selectAllFactory() {
        return factoryMapper.selectAllFactory();
    }

    @Override
    public List<Brand_FactoryDto> selectAllBrandFactoryDto() {
        return factoryMapper.selectAllBrandFactoryDto();
    }

    @Override
    public Factory selectFactoryById(Integer facId) {
        return factoryMapper.selectFactoryById(facId);
    }

    @Override
    public boolean updateFactory(Factory factory) {
        factoryMapper.updateFactory(factory);
        return true;
    }

    @Override
    public boolean deleteFactory(Integer facId) {
        factoryMapper.deleteFactory(facId);
        return true;
    }

    @Override
    public List<Brand_FactoryDto> factoryMohu(Factory factory) {
        return factoryMapper.factoryMohu(factory);
    }

    @Override
    public List<Factory> selectFactoryBybrandId(Integer brandId) {
        return factoryMapper.selectFactoryBybrandId(brandId);
    }
}
