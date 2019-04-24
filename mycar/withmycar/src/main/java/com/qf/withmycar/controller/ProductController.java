package com.qf.withmycar.controller;

import com.qf.withmycar.pojo.Product;
import com.qf.withmycar.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

//    自有商品展示
    @RequestMapping("/selectAllProduct")
    public String selectAllProduct(Model model){
        List<Product> products = productService.selectAllProduct();
        model.addAttribute("products",products);
        return "wk_selfproducts";
    }
}
