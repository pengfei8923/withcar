package com.qf.withmycar.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Product implements Serializable {

    private Integer id;
    private String name;
    private String description;
    private String service;
    private Date createTime;
    private Date updateTime;
    private int state;//状态

}