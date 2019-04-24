package com.qf.withmycar.controller;

import com.qf.withmycar.pojo.AdminUser;
import com.qf.withmycar.pojo.MemberLoginLog;
import com.qf.withmycar.service.MemberLoginLogService;
import com.qf.withmycar.vo.MemberLoginLogUserVo;
import com.qf.withmycar.vo.MemberLoginLogVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MemberLoginLogController {

    @Autowired
    MemberLoginLogService memberLoginLogService;

    /*操作日志*/
//    @RequestMapping("/caozuorizhi1")
//    public String caozuozhongxin(Model model) {
//        List<MemberLoginLog> memberLoginLogs = memberLoginLogService.memberAll();
//        model.addAttribute("members",memberLoginLogs);
////        System.out.println(memberLoginLogs);
//        return "gt_caozuorizhi";
//    }
    /*操作日志*/
    @RequestMapping("/caozuorizhi")
    public String selectMo(Model model) {
        List<MemberLoginLogUserVo> memberLoginLogUserVos = memberLoginLogService.selectMo(1);
        model.addAttribute("memberu", memberLoginLogUserVos);
//        System.out.println(memberLoginLogUserVos);
        return "gt_caozuorizhi";
    }


    /*個人中心*/
    @RequestMapping("/gerenzhongxin")
    public String selectA(Model model) {
        List<MemberLoginLogVo> memberLoginLogVos = memberLoginLogService.selectA(1);
        model.addAttribute("membera", memberLoginLogVos);
//        System.out.println(memberLoginLogVos);
        return "gt_gerenzhongxin";
    }

    /*個人中心修改*/
    @RequestMapping("/updateUser")
    @ResponseBody
    public Object updateUser(@RequestBody AdminUser user) {
        System.out.println(user);
        memberLoginLogService.updateUser(user);
        return true;
    }

    /*個人中心修改之前查詢密码*/
    @RequestMapping("/updateUserPass")
    @ResponseBody
    public Object updateUserPass(@RequestBody AdminUser user1) {
//        System.out.println(user1);
        String userPass = memberLoginLogService.updateUserPass(user1);
        if (userPass != null) {
            return true;
        }
        return false;
    }

    /*個人中心修改密码*/
    @RequestMapping("/updateUserPass1")
    @ResponseBody
    public Object updateUserPass1(@RequestBody AdminUser user2) {
//        System.out.println(user2);
        memberLoginLogService.updateUser(user2);
        return true;
    }
    /*操作日志模糊查询*/

    @RequestMapping("/selectMoHu")
    @ResponseBody
    public Object selectMoHu(@RequestBody AdminUser admin) {
        return null;
    }
}
