package com.qf.withmycar.service.impl;

import com.qf.withmycar.mapper.DictCountryMapper;
import com.qf.withmycar.pojo.DictCountry;
import com.qf.withmycar.service.DictCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DictCountryServiceImpl implements DictCountryService {
    @Autowired
    DictCountryMapper dictCountryMapper;
    @Override
    public List<DictCountry> selectAllCountries() {
        return dictCountryMapper.selectAllCountries();
    }
}
