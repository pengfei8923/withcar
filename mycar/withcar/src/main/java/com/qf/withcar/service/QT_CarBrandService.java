package com.qf.withcar.service;

import com.qf.withmycar.dto.QT_CarBrand_FirstCharDto;
import com.qf.withmycar.pojo.CarSeries;
import com.qf.withmycar.pojo.Factory;
import com.qf.withmycar.vo.CarSeriesModelsVo;

import java.util.List;

public interface QT_CarBrandService {

    /*查询品牌的第一个首字母*/
    public List<String> selectBrandFirstChar();
    /*根据第一个字母查询下面的所有品牌*/
    public List<QT_CarBrand_FirstCharDto> selectCbByFirstChar(String element);
    /*查询一个品牌下的所有厂商*/
    public List<Factory> selectFactoryBybrandId(Integer brandId);
    /*根据facId查询车系信息 通过车系查询出所有车款 循环查询出厂商的最低价 最高价并返回给页面*/
    public List<CarSeriesModelsVo> selectAllByFacId(Integer facId);
}
