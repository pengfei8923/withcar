package com.qf.withmycar.vo;

import lombok.Data;

import java.io.Serializable;
@Data
public class CarSeriesModelsVo implements Serializable {
    private Integer id;       //车系id
    private String seriesName;//车系名称
    private String highPrice;//最高价
    private String lowPrice;//最低价
}
