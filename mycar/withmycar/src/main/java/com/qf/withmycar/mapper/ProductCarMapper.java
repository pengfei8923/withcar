package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.ProductCar;

public interface ProductCarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_car
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_car
     *
     * @mbggenerated
     */
    int insert(ProductCar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_car
     *
     * @mbggenerated
     */
    int insertSelective(ProductCar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_car
     *
     * @mbggenerated
     */
    ProductCar selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_car
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProductCar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_car
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ProductCar record);
}