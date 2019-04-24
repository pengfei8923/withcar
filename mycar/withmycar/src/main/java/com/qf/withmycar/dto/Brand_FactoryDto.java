package com.qf.withmycar.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Brand_FactoryDto implements Serializable {
    private Integer facId;
    private String facName;
    private String namea;
    private String facLogo;
    private Date createTime;


}
