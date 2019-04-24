package com.qf.withmycar.mapper;

import com.qf.withmycar.dto.Brand_FactoryDto;
import com.qf.withmycar.pojo.Factory;

import java.util.List;

public interface FactoryMapper {
    /*加入一条厂商信息*/
    public void addFactory(Factory factory);
    /*查询所有厂商信息*/
    public List<Factory> selectAllFactory();
    /*厂商表和品牌表联查所有dto*/
    public List<Brand_FactoryDto> selectAllBrandFactoryDto();
    /*编辑信息时根据id查询*/
    public Factory selectFactoryById(Integer facId);
    /*修改信息*/
    public void updateFactory(Factory factory);
    /*删除一条厂商信息*/
    public void deleteFactory(Integer facId);
    /*模糊查询搜索*/
    public List<Brand_FactoryDto>factoryMohu(Factory factory);
    /*查询一个品牌下的所有厂商*/
    public List<Factory> selectFactoryBybrandId(Integer brandId);
}
