package com.qf.withmycar.vo;

import java.util.regex.Pattern;

public class AdminUserRoleVo {
    private Integer id;
    private Integer userid;
    private Integer roleid;
    private String username;
    private String name;
    private String js;
    private String rname;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    public Integer getIdzj() {
        return idzj;
    }

    public void setIdzj(Integer idzj) {
        this.idzj = idzj;
    }

    private Integer idzj;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Override
    public String toString() {
        return "AdminUserRoleVo{" +
                "id=" + id +
                ", userid=" + userid +
                ", roleid=" + roleid +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", js='" + js + '\'' +
                ", rname='" + rname + '\'' +
                ", idzj=" + idzj +
                '}';
    }
}
