package com.qf.withmycar.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class PageInfo implements Serializable {
    private Integer page;
    private Integer pageNum;
}
