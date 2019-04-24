package com.qf.withmycar.controller;

import com.qf.withmycar.dto.AdminMenuAuthDto;
import com.qf.withmycar.pojo.AdminMenuAuth;
import com.qf.withmycar.pojo.AdminRole;
import com.qf.withmycar.pojo.AdminRoleMenuKey;
import com.qf.withmycar.service.AdminMenuAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminMenuAuthController {
    @Autowired
    AdminMenuAuthService adminMenuAuthService;

    @RequestMapping(value = "/dongtai",method = RequestMethod.GET)
    @ResponseBody
    public List<AdminMenuAuth> dongtai(@RequestParam int id){
        //System.out.println(adminMenuAuthService.dongtai(id));
        return adminMenuAuthService.dongtai(id);
    }
    /*
    管理员列表
     */
    @RequestMapping("/admin_one")
    public String admin_one(){
        return "nrwj_admin_one";
    }

    /*
    角色管理
     */
    @RequestMapping("/role")
    public String role(){
        return "nrwj_role";
    }


    /*
     * 权限全查
     */
    @RequestMapping("/new_role")
    public String new_role(Model model){
        List<AdminMenuAuthDto> quanxianquancha = adminMenuAuthService.quanxianquancha();
        model.addAttribute("quanxianquancha",quanxianquancha);
        //  System.out.println(quanxianquancha);
        return "nrwj_new_role";
    }
    /*
     *
     */
    @RequestMapping("/update_role")
    public String update_role(Model model,@RequestParam Integer id){
        System.out.println(id);
        AdminRole gairole=adminMenuAuthService.selectRoleById(id);
        System.out.println(gairole);
        model.addAttribute("gairole",gairole);
        model.addAttribute("id",id);
        List<AdminMenuAuthDto> quanxianquancha = adminMenuAuthService.quanxianquancha();
        model.addAttribute("quanxianquancha",quanxianquancha);
        //  System.out.println(quanxianquancha);
        return "nrwj_update_role";
    }

    /*
     * 根据ID修改角色
     */
    @RequestMapping("updateRoleById")
    @ResponseBody
    public boolean updateRoleById(@RequestParam(value = "userids")Integer[] userids,@RequestParam String name,@RequestParam Integer id){
        //修改角色名称
        AdminRole adminRole1 = new AdminRole();
        adminRole1.setId(id);
        System.out.println(id);
        adminRole1.setName(name);
        System.out.println(name);
        adminMenuAuthService.updateRoleById(adminRole1);
        //跟据roleid删除中间表角色权限
        adminMenuAuthService.deleteRoleAuth(id);
        for (Integer menuId:userids) {
            AdminRoleMenuKey adminRoleMenuKey = new AdminRoleMenuKey();
            adminRoleMenuKey.setRoleId(id);
            adminRoleMenuKey.setMenuId(menuId);
            //添加中间表
            AdminRoleMenuKey adminRole = new AdminRoleMenuKey();
            adminRole.setRoleId(id);
            adminRole.setMenuId(menuId);
            adminMenuAuthService.insertRoleAuth(adminRole);
        }

        return true;
    }
}
