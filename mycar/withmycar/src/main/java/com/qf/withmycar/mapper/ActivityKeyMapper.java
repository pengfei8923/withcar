package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.ActivityKey;

public interface ActivityKeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_key
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_key
     *
     * @mbggenerated
     */
    int insert(ActivityKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_key
     *
     * @mbggenerated
     */
    int insertSelective(ActivityKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_key
     *
     * @mbggenerated
     */
    ActivityKey selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_key
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ActivityKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_key
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ActivityKey record);
}