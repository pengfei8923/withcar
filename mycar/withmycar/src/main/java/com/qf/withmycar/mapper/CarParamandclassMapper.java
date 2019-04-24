package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.CarParamandclass;

public interface CarParamandclassMapper {
    int deleteByPrimaryKey(Integer cpcid);
    int insert(CarParamandclass record);
    int insertSelective(CarParamandclass record);
    CarParamandclass selectByPrimaryKey(Integer cpcid);
    int updateByPrimaryKeySelective(CarParamandclass record);
    int updateByPrimaryKey(CarParamandclass record);

    /**
     * 删除
     * @param paramid
     * @return
     */
    Integer delCarPACByParamid(Integer paramid);

    /**
     * 根据paramid查询
     * @param paramid
     * @return
     */
    CarParamandclass selectPACByParamid(Integer paramid);
}