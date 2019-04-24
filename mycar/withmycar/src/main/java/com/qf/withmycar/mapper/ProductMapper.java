package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

//    展示所有自有商品
    public List<Product> selectAllProduct();
}