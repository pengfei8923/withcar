package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.SdkTemp;

public interface SdkTempMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_temp
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_temp
     *
     * @mbggenerated
     */
    int insert(SdkTemp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_temp
     *
     * @mbggenerated
     */
    int insertSelective(SdkTemp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_temp
     *
     * @mbggenerated
     */
    SdkTemp selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_temp
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SdkTemp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_temp
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SdkTemp record);
}