package com.qf.withmycar.mapper;

import com.qf.withmycar.dto.Ck_UserCollect;
import com.qf.withmycar.pojo.MemberFav;

import java.util.List;

public interface MemberFavMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MemberFav record);

    int insertSelective(MemberFav record);

    MemberFav selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberFav record);

    int updateByPrimaryKey(MemberFav record);



    List<Ck_UserCollect> queryActiByUserId(long id);
    List<Ck_UserCollect> queryArticleByUserId(long id);
}