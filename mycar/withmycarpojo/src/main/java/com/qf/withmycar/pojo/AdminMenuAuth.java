package com.qf.withmycar.pojo;

public class AdminMenuAuth {

    private Integer id;
    private String controller;
    private String action;
    private String name;
    private String classname;
    private Integer status;
    private Integer sort;
    private Integer type;
    private String parent_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    @Override
    public String toString() {
        return "AdminMenuAuth{" +
                "id=" + id +
                ", controller='" + controller + '\'' +
                ", action='" + action + '\'' +
                ", name='" + name + '\'' +
                ", classname='" + classname + '\'' +
                ", status=" + status +
                ", sort=" + sort +
                ", type=" + type +
                ", parent_id='" + parent_id + '\'' +
                '}';
    }
}
