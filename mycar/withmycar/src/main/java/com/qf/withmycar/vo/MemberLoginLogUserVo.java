package com.qf.withmycar.vo;

import javax.xml.crypto.Data;
import java.util.Date;

public class MemberLoginLogUserVo {

    private Integer id;
    private String named;
    private Date timed;
    private String ip;
    private String firstd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamed() {
        return named;
    }

    public void setNamed(String named) {
        this.named = named;
    }

    public Date getTimed() {
        return timed;
    }

    public void setTimed(Date timed) {
        this.timed = timed;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getFirstd() {
        return firstd;
    }

    public void setFirstd(String firstd) {
        this.firstd = firstd;
    }

    public MemberLoginLogUserVo(Integer id, String named, Date timed, String ip, String firstd) {
        this.id = id;
        this.named = named;
        this.timed = timed;
        this.ip = ip;
        this.firstd = firstd;
    }

    public MemberLoginLogUserVo() {
        super();
    }

    @Override
    public String toString() {
        return "MemberLoginLogUserVo{" +
                "id=" + id +
                ", named='" + named + '\'' +
                ", timed=" + timed +
                ", ip='" + ip + '\'' +
                ", firstd='" + firstd + '\'' +
                '}';
    }
}
