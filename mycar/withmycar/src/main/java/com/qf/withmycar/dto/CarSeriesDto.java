package com.qf.withmycar.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class CarSeriesDto implements Serializable {
    private Integer id;
    private String seriesName;
    private String namea;
    private String facName;
    private String tyName;

}
