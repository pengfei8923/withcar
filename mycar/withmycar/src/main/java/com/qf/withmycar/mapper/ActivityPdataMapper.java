package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.ActivityPdata;

public interface ActivityPdataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_pdata
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_pdata
     *
     * @mbggenerated
     */
    int insert(ActivityPdata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_pdata
     *
     * @mbggenerated
     */
    int insertSelective(ActivityPdata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_pdata
     *
     * @mbggenerated
     */
    ActivityPdata selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_pdata
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ActivityPdata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_pdata
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(ActivityPdata record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_pdata
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ActivityPdata record);
}