package com.qf.withcar.service.impl;

import com.qf.withcar.service.UserCarService;
import com.qf.withmycar.dto.CarModelsDto;
import com.qf.withmycar.dto.CarSeriesDto;
import com.qf.withmycar.dto.Ck_UserCar;
import com.qf.withmycar.dto.Ck_UserCollect;
import com.qf.withmycar.mapper.*;
import com.qf.withmycar.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCarServiceImpl implements UserCarService {
    @Autowired
    CarSeriesMapper carSeriesMapper;
    @Autowired
    FactoryMapper factoryMapper;
    @Autowired
    CarTypeMapper carTypeMapper;
    @Autowired
    CarModelsMapper carModelsMapper;
    @Autowired
    CarBrandMapper carBrandMapper;

    /*查询一个品牌下的所有厂商*/
    @Override
    public List<Factory> selectFactoryBybrandId(Integer brandId) {
        return factoryMapper.selectFactoryBybrandId(brandId);
    }

    /*根据厂商id查询车系信息*/
    @Override
    public List<CarSeries> selectCarSeriesByFacId(Integer facId) {
        return carSeriesMapper.selectCarSeriesByFacId(facId);
    }

    /*根据车系id查询当前的类型id和类型名称*/
    @Override
    public CarType selectTypeBySeries(Integer id) {
        return carTypeMapper.selectTypeBySeries(id);
    }
    /*查询一个主类型下的所有子类型*/
    @Override
    public List<CarType> selectChildren(Integer tyid) {
        return carTypeMapper.selectChildren(tyid);
    }

    @Override
    public List<CarModels>  selectModelBySeriesId(Integer id) {
        return carModelsMapper.queryCarModelBySeriesId(id);
    }

    @Override
    public List<CarBrand> getAllBrands() {
        return carBrandMapper.selectAllBrands();
    }

    @Override
    public List<Factory> getAllFactory() {
        return factoryMapper.selectAllFactory();
    }

    @Override
    public List<CarSeriesDto> getAllCarSeriesDto() {
        return carSeriesMapper.selectAllCarSeriesDto();
    }

    @Override
    public List<CarType> getAllCarTypes() {
        return carTypeMapper.selectAllCarTypes();
    }

    @Override
    public List<CarType> getAllChildrenTypes() {
        return carTypeMapper.selectAllChildrenTypes();
    }

    @Override
    public List<CarModelsDto> getAllCarModels() {
        return carModelsMapper.selectAllCarModelsDto();
    }

    @Autowired
    MemberCarMapper memberCarMapper;
    @Autowired
    MemberFavMapper memberFavMapper;
    @Override
    public void addMycar(MemberCar memberCar) {
        memberCarMapper.insertMycar(memberCar);
    }

    @Override
    public List<Ck_UserCar> selectUserCarByUserId(Long userId) {
        List<Ck_UserCar> Ck_UserCar = memberCarMapper.selectByMemberId(userId);
        return Ck_UserCar;
    }

    @Override
    public void removeMyCar(long id) {
        memberCarMapper.deleteMycar(id);
    }

    @Override
    public List<Ck_UserCollect> getMyActivities(long id) {
        return memberFavMapper.queryActiByUserId(id);
    }
//用户咨询
    @Override
    public List<Ck_UserCollect> getMyZiXun(long id) {
        return memberFavMapper.queryArticleByUserId(id);
    }
//删除我的收藏
    @Override
    public void removeMyCollect(long id) {
        memberFavMapper.deleteByPrimaryKey(id);
    }
}
