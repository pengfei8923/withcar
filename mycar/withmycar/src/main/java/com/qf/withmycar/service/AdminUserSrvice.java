package com.qf.withmycar.service;

import com.qf.withmycar.dto.AdminMenuAuthDto;
import com.qf.withmycar.dto.AdminUserDto;
import com.qf.withmycar.pojo.AdminUser;
import com.qf.withmycar.pojo.AdminUserRole;
import com.qf.withmycar.vo.AdminUserRoleVo;

import java.util.List;

public interface AdminUserSrvice {

    /**
     * 根据username查询id及name
     */
    public AdminUser selectIdAndName(String username);

    /**
     * 根据username查对应的权限
     */
    public List<AdminMenuAuthDto> selectUsernameQuanxian(String username);

    /**
     * 根据名字查所有
     */
    public AdminUser findUserByUsername(String username);

    /**
     * 查询新增管理的id
     * @param adminUser
     * @return
     */
    public int selectAdeminUser(String username);
    /*
    新增管理
     */
    public boolean insertAll(AdminUser adminUser);
    /*
    新增中间表
    */
    public void insertAdminUserRole(AdminUserRole adminUserRole);
    /**
     * 修改中间表
     * @param id
     * @return
     */
    public String updatezhaonghian(AdminUserRoleVo adminUserRoleVo);
    /*
    查询中间表id
     */
    public int selectzhongjian(int id);
    /**
     * 修改查询
     */
    public List<AdminUser> xungaichaxun(int id);
    /**
     * 修改管理
     */
    public boolean updateAdminUser(AdminUser adminUser);
    /**
     * 全查
     * @return
     */
    public List<AdminUserDto> getur();
    /*
    冻结用户
     */
    public boolean updatestatus(int id);

    /*
    模糊查询
     */
    public List<AdminUserRoleVo> mohuchaAdminUserRole(AdminUserRoleVo adminUserRoleVo);
}
