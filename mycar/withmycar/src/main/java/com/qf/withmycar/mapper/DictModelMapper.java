package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.DictModel;

public interface DictModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_model
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_model
     *
     * @mbggenerated
     */
    int insert(DictModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_model
     *
     * @mbggenerated
     */
    int insertSelective(DictModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_model
     *
     * @mbggenerated
     */
    DictModel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_model
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DictModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_model
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DictModel record);
}