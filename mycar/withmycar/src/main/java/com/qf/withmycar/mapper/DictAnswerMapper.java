package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.DictAnswer;

public interface DictAnswerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_answer
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_answer
     *
     * @mbggenerated
     */
    int insert(DictAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_answer
     *
     * @mbggenerated
     */
    int insertSelective(DictAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_answer
     *
     * @mbggenerated
     */
    DictAnswer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_answer
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DictAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_answer
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DictAnswer record);
}