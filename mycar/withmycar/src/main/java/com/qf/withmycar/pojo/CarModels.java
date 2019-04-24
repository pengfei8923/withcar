package com.qf.withmycar.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class CarModels {
    private Integer cmid;
    private String cmname;//车款名称
    private String cmyear;//年款
    private Integer brandid;//品牌id
    private Integer facid;//厂商id
    private Integer seriesid;//车系id
    private Integer tyid;//类型id
    private Integer styid;//二级类型id
    private String picurl;//图片地址
    private Date createtime;//创建时间
    private Date lastupdate;//修改时间

    @Override
    public String toString() {
        return "CarModels{" +
                "cmid=" + cmid +
                ", cmname='" + cmname + '\'' +
                ", cmyear='" + cmyear + '\'' +
                ", brandid=" + brandid +
                ", facid=" + facid +
                ", seriesid=" + seriesid +
                ", tyid=" + tyid +
                ", styid=" + styid +
                ", picurl='" + picurl + '\'' +
                ", createtime=" + createtime +
                ", lastupdate=" + lastupdate +
                '}';
    }
}
