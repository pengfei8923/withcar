package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.MemberProfileLog;

public interface MemberProfileLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_profile_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_profile_log
     *
     * @mbggenerated
     */
    int insert(MemberProfileLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_profile_log
     *
     * @mbggenerated
     */
    int insertSelective(MemberProfileLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_profile_log
     *
     * @mbggenerated
     */
    MemberProfileLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_profile_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MemberProfileLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_profile_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MemberProfileLog record);
}