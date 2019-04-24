package com.qf.withmycar.pojo;

public class AdminRoleMenuKey {

   private Integer roleId;
    private Integer menuId;

    public Integer getRoleId() {
        return roleId;
    }
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }


    @Override
    public String toString() {
        return "AdminRoleMenuKey{" +
                "roleId=" + roleId +
                ", menuId=" + menuId +
                '}';
    }
}