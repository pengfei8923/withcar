package com.qf.withmycar.service;
import com.qf.withmycar.dto.AdminMenuAuthDto;
import com.qf.withmycar.dto.AdminMenuAuthDto;
import com.qf.withmycar.pojo.AdminMenuAuth;
import com.qf.withmycar.pojo.AdminRole;
import com.qf.withmycar.pojo.AdminRoleMenuKey;
import com.qf.withmycar.pojo.AdminUserRole;

import java.util.List;

public interface AdminMenuAuthService {

    public List<AdminMenuAuth> dongtai(int id);

        /*
权限全查
 */
    public List<AdminMenuAuthDto> quanxianquancha();

           /*
根据ID修改角色
 */
           public boolean updateRoleById(AdminRole adminRole);

    //通过ID查角色
    public AdminRole selectRoleById(int id);

    //编辑角色权限
    public boolean deleteRoleAuth(Integer id);
    public void insertRoleAuth(AdminRoleMenuKey adminRoleMenuKey);
}
