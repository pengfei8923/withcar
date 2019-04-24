package com.qf.withmycar.mapper;

import com.qf.withmycar.dto.QT_CarBrand_FirstCharDto;
import com.qf.withmycar.pojo.CarBrand;

import java.util.List;

public interface CarBrandMapper {
    /*删除一条品牌信息*/
    public void  deleteByPrimaryKey(Integer id);
    int insert(CarBrand record);
    public void insertSelective(CarBrand record);
    /*修改一条品牌信息*/
    public void  updateByPrimaryKeySelective(CarBrand record);
    int updateByPrimaryKey(CarBrand record);
    /*查询全部品牌信息*/
    public List<CarBrand> selectAllBrands();
    /*根据id查询一个品牌*/
    public CarBrand selectByPrimaryKey(Integer id);
    /*模糊查询，存在则为条件*/
    public List<CarBrand> mohu(CarBrand carBrand);
    /*查询品牌的第一个首字母*/
    public List<String> selectBrandFirstChar();
    /*根据第一个字母查询下面的所有品牌*/
    public List<QT_CarBrand_FirstCharDto> selectCbByFirstChar(String element);
}