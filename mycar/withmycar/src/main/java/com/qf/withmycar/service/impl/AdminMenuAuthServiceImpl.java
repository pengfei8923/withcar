package com.qf.withmycar.service.impl;

import com.qf.withmycar.dto.AdminMenuAuthDto;
import com.qf.withmycar.mapper.AdminMenuAuthMapper;
import com.qf.withmycar.pojo.AdminMenuAuth;
import com.qf.withmycar.pojo.AdminRole;
import com.qf.withmycar.pojo.AdminRoleMenuKey;
import com.qf.withmycar.service.AdminMenuAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminMenuAuthServiceImpl implements AdminMenuAuthService {

    @Autowired(required = false)
    AdminMenuAuthMapper adminMenuAuthMapper;

    @Override
    public List<AdminMenuAuth> dongtai(int id) {
        return adminMenuAuthMapper.dongtai(id);
    }

        @Override
    public List<AdminMenuAuthDto> quanxianquancha() {
        return adminMenuAuthMapper.quanxianquancha();
    }

    @Override
    public boolean updateRoleById(AdminRole adminRole) {
        return adminMenuAuthMapper.updateRoleById(adminRole);
    }

    //通过Id查角色
    @Override
    public AdminRole selectRoleById(int id) {
        return adminMenuAuthMapper.selectRoleById(id);
    }

    /*
     * 编辑角色权限
     */
    @Override
    public boolean deleteRoleAuth(Integer id) {
        return adminMenuAuthMapper.deleteRoleAuth(id);
    }
    @Override
    public void insertRoleAuth(AdminRoleMenuKey adminRoleMenuKey) {
        adminMenuAuthMapper.insertRoleAuth(adminRoleMenuKey);
    }
}
