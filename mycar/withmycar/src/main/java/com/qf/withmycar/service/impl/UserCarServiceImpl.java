package com.qf.withmycar.service.impl;

import com.qf.withmycar.dto.Ck_UserCar;
import com.qf.withmycar.mapper.MemberCarMapper;
import com.qf.withmycar.pojo.MemberCar;
import com.qf.withmycar.service.UserCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserCarServiceImpl implements UserCarService {
    @Autowired(required = false)
    MemberCarMapper carMapper;
    @Override
    public List<Ck_UserCar> getUserCar(long userId) {
        List<Ck_UserCar> ck_userCars = carMapper.selectByMemberId(userId);
        return ck_userCars;
    }
}
