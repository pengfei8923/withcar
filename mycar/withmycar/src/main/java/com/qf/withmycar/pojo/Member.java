package com.qf.withmycar.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class Member implements Serializable {
    private Long id;
    private String useremail;
    private String password;
    private Byte source;
}