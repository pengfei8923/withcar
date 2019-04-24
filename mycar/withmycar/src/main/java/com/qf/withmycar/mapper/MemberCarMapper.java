package com.qf.withmycar.mapper;

import com.qf.withmycar.dto.Ck_UserCar;
import com.qf.withmycar.pojo.MemberCar;

import java.util.List;

public interface MemberCarMapper {
    List<Ck_UserCar> selectByMemberId(Long userId);
    void insertMycar(MemberCar memberCar);
    void deleteMycar(Long id);
}