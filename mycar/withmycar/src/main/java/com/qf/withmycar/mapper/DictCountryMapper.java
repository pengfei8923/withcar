package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.DictCountry;

import java.util.List;

public interface DictCountryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_country
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_country
     *
     * @mbggenerated
     */
    int insert(DictCountry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_country
     *
     * @mbggenerated
     */
    int insertSelective(DictCountry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_country
     *
     * @mbggenerated
     */
    DictCountry selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_country
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DictCountry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_country
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DictCountry record);
    /*查询所有的国家*/
    public List<DictCountry> selectAllCountries();
}