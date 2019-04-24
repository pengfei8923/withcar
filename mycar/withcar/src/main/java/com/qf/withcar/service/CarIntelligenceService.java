package com.qf.withcar.service;

import com.qf.withmycar.pojo.AdminRole;
import com.qf.withmycar.pojo.CarIntelligence;

import java.util.List;

public interface CarIntelligenceService {

    //全查
    public List<CarIntelligence> findAllIntelligence();


    //标签查询

    public List<CarIntelligence> selectMohu(String carSpan);

    //名字模糊查询

    public List<CarIntelligence> selectMohuByName(String carName);

}
