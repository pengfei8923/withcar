package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.DictBrandPoint;

public interface DictBrandPointMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_brand_point
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_brand_point
     *
     * @mbggenerated
     */
    int insert(DictBrandPoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_brand_point
     *
     * @mbggenerated
     */
    int insertSelective(DictBrandPoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_brand_point
     *
     * @mbggenerated
     */
    DictBrandPoint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_brand_point
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DictBrandPoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_brand_point
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DictBrandPoint record);
}