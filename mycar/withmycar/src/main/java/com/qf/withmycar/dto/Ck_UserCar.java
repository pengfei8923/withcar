package com.qf.withmycar.dto;

import lombok.Data;

@Data
public class Ck_UserCar {
    private Long id;
    private String remark;//备注
    private Integer buy_year;//购买年
    private String namea;//品牌名
    private String facname;//厂商名
    private String seriesname;//车系名
    private String cmname;//车款名
    private String tyname;//车类型名称
    private String picurl;//预留图片

}
