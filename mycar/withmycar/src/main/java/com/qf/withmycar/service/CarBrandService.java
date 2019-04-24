package com.qf.withmycar.service;

import com.qf.withmycar.pojo.CarBrand;

import java.util.List;

public interface CarBrandService {
    /*新增品牌*/
    public boolean insertSelective(CarBrand record);
    /*查询全部品牌信息*/
    public List<CarBrand> selectAllBrands();
    /*根据id查询一条品牌信息*/
    public CarBrand selectByPrimaryKey(Integer id);
    /*修改品牌信息*/
    public boolean updateByPrimaryKeySelective(CarBrand record);
    /*删除一条品牌信息*/
    public boolean  deleteByPrimaryKey(Integer id);
    /*模糊查询，存在则为条件*/
    public List<CarBrand> mohu(CarBrand carBrand);
}
