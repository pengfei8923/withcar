package com.qf.withmycar.vo;

import lombok.Data;

import java.io.Serializable;


public class Ck_info implements Serializable {
    private String info;
    private String sex;
    private Byte gender;
    private String  time1;
    private String  time2;
    private Integer page=0;


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        System.out.println("sex"+sex);
        if (sex.equals("男")){
            this.gender=1;
        }else if (sex.equals("女")){
            this.gender=2;
        }
        this.sex = sex;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page*20;
    }

    @Override
    public String toString() {
        return "Ck_info{" +
                "info='" + info + '\'' +
                ", sex='" + sex + '\'' +
                ", gender=" + gender +
                ", time1='" + time1 + '\'' +
                ", time2='" + time2 + '\'' +
                ", page=" + page +
                '}';
    }
}
