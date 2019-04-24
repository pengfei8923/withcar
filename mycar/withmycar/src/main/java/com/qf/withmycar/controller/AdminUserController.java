package com.qf.withmycar.controller;

import com.qf.withmycar.dto.AdminUserDto;
import com.qf.withmycar.pojo.AdminUser;
import com.qf.withmycar.pojo.AdminUserRole;
import com.qf.withmycar.service.AdminUserSrvice;
import com.qf.withmycar.vo.AdminUserRoleVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class AdminUserController {
    @Autowired
    AdminUserSrvice adminUserSrvice;
    @RequestMapping("/login")
    public String logon(){

        return "login";
    }
    /*
    取session name
     */
    @RequestMapping("/sessionadminUsers")
    @ResponseBody
    public Object sessionUser_name(HttpSession session){

        Object adminUsers = session.getAttribute("adminUser");
       // System.out.println(adminUsers);
        return adminUsers;
    }
    /*
    登录 selectUsernameQuanxian  findUserByUsername
     */
    @RequestMapping("/dealLogin")
    public Object selectUsernameQuanxian(String username,String password,HttpSession session){
        //登陆逻辑
        try {
            //构造令牌对象
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            //获取主体对象
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);//是否登录，转交控制权给SecurityManager处理
            if (subject.isAuthenticated()){
                AdminUser adminUser = adminUserSrvice.selectIdAndName(username);

                session.setAttribute("adminUser",adminUser);
//                session.setAttribute("userid",adminUser.getId());
//                session.setAttribute("username",adminUser.getName());
//                Integer userid = (Integer)session.getAttribute("userid");
              //  Object adminUsers = session.getAttribute("adminUser");
            //    System.out.println(adminUsers);

                return "index";
            }
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }

        return "login";

    }

    /**
     * 新增跳转
     * @return
     */
    @RequestMapping("/new_admin")
    public String new_admin(Model model){
        return "nrwj_new_admin";
    }

    /**
     * 新增管理
     * @return
     */
    @RequestMapping(value = "zengjia",method = RequestMethod.POST)
    @ResponseBody
    public boolean zengjia(HttpServletRequest request){

        String username = request.getParameter("username");
        String passwords = request.getParameter("password");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        Byte is_super = Byte.parseByte(request.getParameter("is_super"));
        String consumer = request.getParameter("consumer");
        String remark = request.getParameter("remark");
        String dept = request.getParameter("dept");
//        int is_super=(int)isSuper;
        //处理状态
//        System.out.println(is_superss);
//        Byte is_super;
//        if (is_superss=="超级管理员"){
//           is_super=1;
//            System.out.println(is_super);
//        }else {
//          is_super=0;
//            System.out.println(is_super);
//        }
        System.out.println(is_super);//获取状态角色信息
        // username,password,name,salt,phone,email,create_time,is_super,consumer,remark,dept
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String create_time = df.format(new Date());
        System.out.println(create_time);// new Date()为获取当前系统时间

        Md5Hash md5Hash=new Md5Hash();//shiro md5hash加密
        String algorithmName = "MD5";//加密方式
        Object crdentials = passwords;//密码原值
        Object salt = username;//盐值
        SimpleHash md5= new SimpleHash(algorithmName, crdentials,salt);

        String password = md5.toString();//将对象转化为string
        System.out.println(password);

        AdminUser adminUsers=new AdminUser();
        adminUsers.setUsername(username);
        adminUsers.setPassword(password);
        adminUsers.setName(name);
        adminUsers.setSalt(username);
        adminUsers.setPhone(phone);
        adminUsers.setEmail(email);
        adminUsers.setCreate_time(create_time);
        adminUsers.setIsSuper(is_super);
        adminUsers.setConsumer(consumer);
        adminUsers.setRemark(remark);
        adminUsers.setDept(dept);
        System.out.println(adminUsers);
        adminUserSrvice.insertAll(adminUsers);

        int user_id = adminUserSrvice.selectAdeminUser(username);
        if (is_super==1){
            int role_id=1;
            AdminUserRole adminUserRole = new AdminUserRole();
            adminUserRole.setUserId(user_id);
            adminUserRole.setRoleId(role_id);
            adminUserSrvice.insertAdminUserRole(adminUserRole);
        }else {
            int role_id = 2;
            AdminUserRole adminUserRole = new AdminUserRole();
            adminUserRole.setUserId(user_id);
            adminUserRole.setRoleId(role_id);
            adminUserSrvice.insertAdminUserRole(adminUserRole);
        }

            return true;
    }
    /*
   编辑管理员跳转
    */
    @RequestMapping("/updateadmin")
    public String update_admin(Model model, @RequestParam int id, HttpSession session){

        session.setAttribute("id",id);
        List<AdminUser> xungaichaxun = adminUserSrvice.xungaichaxun(id);
        model.addAttribute("xungaichaxun", xungaichaxun);
        return "nrwj_update_admin";
    }

    /*
    修改管理员
     */
    @RequestMapping(value = "updateAdminUser",method = RequestMethod.POST)
    @ResponseBody
    public boolean updateAdminUser(HttpServletRequest request,HttpSession session){
        Integer id = (Integer)session.getAttribute("id");
        int idzj = (int) adminUserSrvice.selectzhongjian(id);

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        byte isSuper = Byte.parseByte(request.getParameter("is_Super"));
        String name = request.getParameter("name");
        String dept = request.getParameter("dept");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String remark = request.getParameter("remark");
        AdminUserRoleVo adminUserRoleVo=new AdminUserRoleVo();
        int roleids=(int)isSuper;
        if (roleids==1){
            int roleid=1;
            adminUserRoleVo.setUserid(id);
            System.out.println(roleid);
            adminUserRoleVo.setRoleid(roleid);
            adminUserRoleVo.setIdzj(idzj);
            adminUserSrvice.updatezhaonghian(adminUserRoleVo);
        }else {
            int roleid=2;
            System.out.println(roleid);
            adminUserRoleVo.setUserid(id);
            adminUserRoleVo.setRoleid(roleid);
            adminUserRoleVo.setIdzj(idzj);
            adminUserSrvice.updatezhaonghian(adminUserRoleVo);
        }

        AdminUser adminUsers=new AdminUser();
        adminUsers.setId(id);
        adminUsers.setUsername(username);
        adminUsers.setPassword(password);
        adminUsers.setIsSuper(isSuper);
        adminUsers.setName(name);
        adminUsers.setDept(dept);
        adminUsers.setPhone(phone);
        adminUsers.setEmail(email);
        adminUsers.setRemark(remark);
        System.out.println(adminUsers);
        adminUserSrvice.updateAdminUser(adminUsers);
        return true;
    }
    /*
    管理员查询
     */
    @RequestMapping(value = "getur",method = RequestMethod.GET)
    @ResponseBody
    public List<AdminUserDto> getur(){
        return adminUserSrvice.getur();
    }

    /*
    删除（冻结）用户
     */
    @RequestMapping(value = "updatestatus",method = RequestMethod.GET)
    @ResponseBody
    public boolean updatestatus(@RequestParam int id){
        adminUserSrvice.updatestatus(id);
        return true;
    }
/*
* 模糊查询
*/
    @RequestMapping(value ="/mohuchaAdminUserRole",method = RequestMethod.POST)
    @ResponseBody
    public Object mohuchaAdminUserRole(HttpServletRequest request){
        String username=request.getParameter("username");
        String js=request.getParameter("js");
        AdminUserRoleVo adminUserRoleVo = new AdminUserRoleVo();
        adminUserRoleVo.setUsername(username);
        adminUserRoleVo.setJs(js);
        return adminUserSrvice.mohuchaAdminUserRole(adminUserRoleVo);
 }

    /**
     * 修改查询
     */




    @RequestMapping("/out")
    public String out(HttpSession session){
        System.out.println("865451646846165468");
       session.invalidate();
        return "login";
    }

}
