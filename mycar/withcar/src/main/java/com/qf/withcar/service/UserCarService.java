package com.qf.withcar.service;

import com.qf.withmycar.dto.CarModelsDto;
import com.qf.withmycar.dto.CarSeriesDto;
import com.qf.withmycar.dto.Ck_UserCar;
import com.qf.withmycar.dto.Ck_UserCollect;
import com.qf.withmycar.pojo.*;

import java.util.List;

public interface UserCarService {

    List<CarSeries> selectCarSeriesByFacId(Integer facId);
    List<Factory> selectFactoryBybrandId(Integer brandId);
    CarType selectTypeBySeries(Integer id);
    List<CarType> selectChildren(Integer tyid);
    List<CarModels>  selectModelBySeriesId(Integer id);

    List<CarBrand> getAllBrands();
    List<Factory> getAllFactory();
    List<CarSeriesDto> getAllCarSeriesDto();
    List<CarType> getAllCarTypes();
    List<CarType> getAllChildrenTypes();
    List<CarModelsDto> getAllCarModels();

    void addMycar(MemberCar memberCar);
    List<Ck_UserCar> selectUserCarByUserId(Long userId);
    void removeMyCar(long id);

    List<Ck_UserCollect> getMyActivities(long id);
    List<Ck_UserCollect> getMyZiXun(long id);

    void removeMyCollect(long id);

}
