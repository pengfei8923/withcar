package com.qf.withmycar.service;

import com.qf.withmycar.dto.AdminMenuAuthDto;
import com.qf.withmycar.pojo.AdminRole;
import com.qf.withmycar.pojo.AdminRoleMenuKey;
import com.qf.withmycar.pojo.AdminUserRole;

import java.util.List;

public interface AdminUserRoleService {

    /**
     *增加权限
     */
    public void insertAdminRoleMenu(AdminRoleMenuKey adminRoleMenuKey);

    /**
     * 查询新角色id
     */
    public int selectAdminRoleId(String name);

    /**
     * 添加新角色
     */
    public void insertAdminRole(String name);

    //   查
    public List<AdminRole> selectAdminRoleOne();

    //改状态
    public boolean updateRoleDeleted(int id);

    //删
    public boolean deleteRole(int id);

    //模糊
    public List<AdminRole> mohuchaxun(String mohu);


}
