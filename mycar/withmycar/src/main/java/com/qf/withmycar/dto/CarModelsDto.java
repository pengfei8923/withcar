package com.qf.withmycar.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class CarModelsDto implements Serializable {
    private Integer cmid;
    private String cmname;
    private String namea;
    private String cmyear;
    private String seriesname;
    private String tyname;
    private String styname;
    private String picurl;
}
