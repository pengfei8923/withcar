package com.qf.withmycar.service.impl;

import com.qf.withmycar.mapper.ProductMapper;
import com.qf.withmycar.pojo.Product;
import com.qf.withmycar.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> selectAllProduct() {
        List<Product> products = productMapper.selectAllProduct();

        return products;
    }
}
