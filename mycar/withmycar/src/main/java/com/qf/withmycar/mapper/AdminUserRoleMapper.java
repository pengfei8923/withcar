package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.AdminUserRole;

public interface AdminUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbggenerated
     */
    int insert(AdminUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbggenerated
     */
    int insertSelective(AdminUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbggenerated
     */
    AdminUserRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AdminUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_user_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AdminUserRole record);
}