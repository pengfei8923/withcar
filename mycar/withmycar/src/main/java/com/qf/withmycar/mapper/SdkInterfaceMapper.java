package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.SdkInterface;

public interface SdkInterfaceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_interface
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_interface
     *
     * @mbggenerated
     */
    int insert(SdkInterface record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_interface
     *
     * @mbggenerated
     */
    int insertSelective(SdkInterface record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_interface
     *
     * @mbggenerated
     */
    SdkInterface selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_interface
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SdkInterface record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sdk_interface
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SdkInterface record);
}