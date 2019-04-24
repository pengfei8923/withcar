package com.qf.withmycar.service;

import com.qf.withmycar.dto.Ck_UserCar;
import com.qf.withmycar.pojo.MemberCar;

import java.util.List;

public interface UserCarService {

    List<Ck_UserCar> getUserCar(long userId);
}
