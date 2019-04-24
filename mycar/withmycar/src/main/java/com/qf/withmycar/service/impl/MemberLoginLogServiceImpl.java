package com.qf.withmycar.service.impl;

import com.qf.withmycar.mapper.MemberLoginLogMapper;
import com.qf.withmycar.pojo.AdminUser;
import com.qf.withmycar.pojo.MemberLoginLog;
import com.qf.withmycar.service.MemberLoginLogService;
import com.qf.withmycar.vo.MemberLoginLogUserVo;
import com.qf.withmycar.vo.MemberLoginLogVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberLoginLogServiceImpl implements MemberLoginLogService  {

    @Autowired(required = false)
    MemberLoginLogMapper memberLoginLogMapper;
    @Override
    public List<MemberLoginLog> memberAll() {
        return memberLoginLogMapper.memberAll();
    }

    @Override
    public List<MemberLoginLogVo> selectA(Integer id) {
        return memberLoginLogMapper.selectA(id);
    }

    @Override
    public void updateUser(AdminUser user) {
        memberLoginLogMapper.updateUser(user);
    }

    @Override
    public String updateUserPass(AdminUser user1) {
        return memberLoginLogMapper.updateUserPass(user1);
    }

    @Override
    public List<MemberLoginLogUserVo> selectMo(Integer id) {
        return memberLoginLogMapper.selectMo(id);
    }
}
