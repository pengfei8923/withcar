package com.qf.withmycar.service;

import com.qf.withmycar.pojo.AdminUser;
import com.qf.withmycar.pojo.MemberLoginLog;
import com.qf.withmycar.vo.MemberLoginLogUserVo;
import com.qf.withmycar.vo.MemberLoginLogVo;

import java.util.List;

public interface MemberLoginLogService {
    /**
     * 全查
     */

    public List<MemberLoginLog> memberAll();


    /**
     * 个人中心资料查询
     */
    public List<MemberLoginLogVo> selectA(Integer id);

    /**
     * 修改
     */
    public void updateUser(AdminUser user);

    /**
     * 修改密码
     */
    public String updateUserPass(AdminUser user1);

    /**
     * 全查
     */

    public List<MemberLoginLogUserVo> selectMo(Integer id);
}
