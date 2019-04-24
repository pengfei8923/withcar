package com.qf.withmycar.service.impl;
import com.qf.withmycar.dto.AdminMenuAuthDto;
import com.qf.withmycar.mapper.AdminRoleMapper;
import com.qf.withmycar.pojo.AdminRole;
import com.qf.withmycar.pojo.AdminRoleMenuKey;
import com.qf.withmycar.pojo.AdminUserRole;
import com.qf.withmycar.service.AdminUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserRoleServiceImpl implements AdminUserRoleService {
@Autowired(required=false)
    AdminRoleMapper adminRoleMapper;


    /**
     *增加权限
     */
    @Override
    public void insertAdminRoleMenu(AdminRoleMenuKey adminRoleMenuKey) {
        adminRoleMapper.insertAdminRoleMenu(adminRoleMenuKey);
    }

    /**
     * 查询新角色id
     */
    @Override
    public int selectAdminRoleId(String name) {
        return adminRoleMapper.selectAdminRoleId(name);
    }

    /**
     * 添加新角色
     */
    @Override
    public void insertAdminRole(String name) {
            adminRoleMapper.insertAdminRole(name);
    }

    //查
    @Override
    public List<AdminRole> selectAdminRoleOne() {
        return adminRoleMapper.selectAdminRoleOne();
    }
//改删
    @Override
    public boolean updateRoleDeleted(int id) {
        adminRoleMapper.updateRoleDeleted(id);
        return true;
    }
    @Override
    public boolean deleteRole(int id) {
        adminRoleMapper.deleteRole(id);
        return true;
    }
    //模糊查询
    @Override
    public List<AdminRole> mohuchaxun(String mohu) {
        return adminRoleMapper.mohuchaxun(mohu);
    }


}
