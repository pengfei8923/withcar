package com.qf.withmycar.controller;

import com.qf.withmycar.dto.AdminMenuAuthDto;
import com.qf.withmycar.pojo.AdminRole;
import com.qf.withmycar.pojo.AdminRoleMenuKey;
import com.qf.withmycar.service.AdminUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AdminUserRoleController {
    @Autowired
    AdminUserRoleService adminUserRoleService;
    /**
     *增加角色-查询角色id-添加角色权限
     */
    @RequestMapping("/insertAdminRoleMenu")
    @ResponseBody
    public boolean insertAdminRoleMenu(@RequestParam(value = "userids")Integer[] userids,@RequestParam String name){



        adminUserRoleService.insertAdminRole(name);//增加角色
        int roleId = adminUserRoleService.selectAdminRoleId(name);//查询新增角色id
        for (Integer menuid:userids) {//添加角色权限
            AdminRoleMenuKey adminRoleMenuKey = new AdminRoleMenuKey();
            adminRoleMenuKey.setRoleId(roleId);
            adminRoleMenuKey.setMenuId(menuid);
            adminUserRoleService.insertAdminRoleMenu(adminRoleMenuKey);

        }
        return true;
    }
    /**
     * 查询新角色id
     */
    @RequestMapping("/selectAdminRoleId")
    @ResponseBody
    public int selectAdminRoleId(@RequestParam String name){
        return adminUserRoleService.selectAdminRoleId(name);
    }
    /**
     * 添加新角色
     */
    @RequestMapping("/insertAdminRole")
    @ResponseBody
    public void insertAdminRole(@RequestParam  String name){
        System.out.println(name);
        adminUserRoleService.insertAdminRole(name);
    }



    //查
    @RequestMapping("selectAdminRoleOne")
    @ResponseBody
    public List<AdminRole> selectAdminRoleOne(){
        System.out.println();
        return adminUserRoleService.selectAdminRoleOne();
    }


    //改删
    @RequestMapping(value = "/updateRoleDeleted",method = RequestMethod.GET)
    @ResponseBody
    public boolean updateRolDeleted(@RequestParam int id){
        adminUserRoleService.updateRoleDeleted(id);
        return true;
    }

    @RequestMapping(value = "/deleteRole",method = RequestMethod.GET)
    @ResponseBody
    public boolean deleteRole(@RequestParam int id){
        adminUserRoleService.deleteRole(id);
        return true;
    }

    //模糊查询
    @RequestMapping("mohuchaxun")
    @ResponseBody
    public Object mohuchaxun(@RequestParam String mohu){
        System.out.println(mohu);
        System.out.println(adminUserRoleService.mohuchaxun(mohu));
        return adminUserRoleService.mohuchaxun(mohu);

    }

}
