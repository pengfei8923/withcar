package com.qf.withmycar.service.impl;

import com.qf.withmycar.dto.AdminMenuAuthDto;
import com.qf.withmycar.dto.AdminUserDto;
import com.qf.withmycar.mapper.AdminUserMapper;
import com.qf.withmycar.pojo.AdminUser;
import com.qf.withmycar.pojo.AdminUserRole;
import com.qf.withmycar.service.AdminUserSrvice;
import com.qf.withmycar.vo.AdminUserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserSrviceImpl implements AdminUserSrvice {


    @Autowired(required = false)
    AdminUserMapper adminUserMapper;

    /**
     * 根据username查询id及name
     */
    @Override
    public AdminUser selectIdAndName(String username) {
        return adminUserMapper.selectIdAndName(username);
    }

    /**
     * 根据username查对应的权限
     */
    @Override
    public List<AdminMenuAuthDto> selectUsernameQuanxian(String username) {
        return adminUserMapper.selectUsernameQuanxian(username);
    }

    /**
     * 根据名字查所有
     */
    @Override
    public AdminUser findUserByUsername(String username) {
        return adminUserMapper.findUserByUsername(username);
    }

    /**
     * 查询新增管理的id
     * @param adminUser
     * @return
     */
    @Override
    public int selectAdeminUser(String username) {
        return adminUserMapper.selectAdeminUser(username);
    }

    /**
     * 新增管理
     * @return
     */
    @Override
    public boolean insertAll(AdminUser adminUser) {
        adminUserMapper.insertAll(adminUser);
        return true;
    }
    /*
    新增中间表
     */
    @Override
    public void insertAdminUserRole(AdminUserRole adminUserRole) {
        adminUserMapper.insertAdminUserRole(adminUserRole);
    }

    /*
    修改中间表
     */
    @Override
    public String updatezhaonghian(AdminUserRoleVo adminUserRoleVo) {

        adminUserMapper.updatezhaonghian(adminUserRoleVo);
        return "nrwj_admin_one";
    }

    /*
        查询中间表id
         */
    @Override
    public int selectzhongjian(int id) {
        return adminUserMapper.selectzhongjian(id);
    }

    @Override
    public List<AdminUser> xungaichaxun(int id) {
        return adminUserMapper.xungaichaxun(id);
    }
/*
修改管理
 */
    @Override
    public boolean updateAdminUser(AdminUser adminUser) {
        adminUserMapper.updateAdminUser(adminUser);
        return true;
    }

    @Override
    public List<AdminUserDto> getur() {
        return adminUserMapper.getur();
    }

    @Override
    public boolean updatestatus(int id) {
        adminUserMapper.updatestatus(id);
        return true;
    }
        /*
        模糊查询
        */
    @Override
    public List<AdminUserRoleVo> mohuchaAdminUserRole(AdminUserRoleVo adminUserRoleVo) {
        return adminUserMapper.mohuchaAdminUserRole(adminUserRoleVo);
    }

}
