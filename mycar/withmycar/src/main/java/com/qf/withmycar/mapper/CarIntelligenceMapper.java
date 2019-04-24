package com.qf.withmycar.mapper;



import com.qf.withmycar.pojo.CarIntelligence;

import java.util.List;

public interface CarIntelligenceMapper {

    //全查
    public List<CarIntelligence> findAllIntelligence();

    //模糊查询

    public List<CarIntelligence> selectMohu(String carSpan);
 //名字模糊
    public List<CarIntelligence> selectMohuByName(String carName);
}
