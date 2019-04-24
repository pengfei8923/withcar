package com.qf.withmycar.dto;

import java.util.List;

public class AdminMenuAuthDto {

    private Integer sort;
    private Integer status;
   private Integer id;
   private Integer pid;
   private String icon;
   private String url;
   private String name;
   private String pname;
   private Integer parent_id;
    List<AdminMenuAuthDto> children;

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public AdminMenuAuthDto() {
    }

    public AdminMenuAuthDto(Integer id, Integer pid, String icon, String url, String name, String pname) {
        this.id = id;
        this.pid = pid;
        this.icon = icon;
        this.url = url;
        this.name = name;
        this.pname = pname;
    }

    public List<AdminMenuAuthDto> getChildren() {
        return children;
    }

    public void setChildren(List<AdminMenuAuthDto> children) {
        this.children = children;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AdminMenuAuthDto{" +
                "sort=" + sort +
                ", status=" + status +
                ", id=" + id +
                ", pid=" + pid +
                ", icon='" + icon + '\'' +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", pname='" + pname + '\'' +
                ", parent_id=" + parent_id +
                ", children=" + children +
                '}';
    }
}
