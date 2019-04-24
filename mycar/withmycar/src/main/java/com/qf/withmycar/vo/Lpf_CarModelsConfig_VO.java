package com.qf.withmycar.vo;

import lombok.Data;

@Data
public class Lpf_CarModelsConfig_VO {
    private Integer pacid;
    private String pacname;//参数类型
    private String pacstate;//参数状态
    private Integer paramid;
    private String paramname;//参数名
    private String paramstate;//参数状态
    private String parambase;//是否为基础参数
    private Integer cpcsortid;//排序id
}
