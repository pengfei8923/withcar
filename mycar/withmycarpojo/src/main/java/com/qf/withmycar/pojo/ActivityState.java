package com.qf.withmycar.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author:maxing
 * @Date:2019/4/1515:41
 * @Version 1.0
 */
@Data
public class ActivityState implements Serializable {
    Integer id;
    String state;
}
