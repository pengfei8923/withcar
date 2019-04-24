package com.qf.withmycar.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Factory {
    private Integer facId;
    private String facName;
    private Integer brandId;
    private String facLogo;
    private Date createTime;
    private Date lastUpdate;

}
