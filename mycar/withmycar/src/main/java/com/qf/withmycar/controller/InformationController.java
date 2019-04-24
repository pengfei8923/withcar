package com.qf.withmycar.controller;

import com.qf.withmycar.dto.AuditInformation;
import com.qf.withmycar.pojo.Article;
import com.qf.withmycar.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 2019.4.13.
 */
@Controller
public class InformationController {
    @Autowired
    InformationService informationService;
    @RequestMapping("/information")
    public String Information(){
        return "wyf_information";
    }

    @RequestMapping("/audit_information")
    public String AuditInformation(){
        return "wyf_audit_information";
    }

    @RequestMapping("/release_information")
    public String ReleaseInformation(){
        return "wyf_release_information";
    }
    @RequestMapping("/list_information")
    public String ListInformation(){
        return "wyf_list_information";
    }

    //新增
    @RequestMapping(value = "addArticle")
    @ResponseBody
    public void addArticle(@RequestBody Article article){
        informationService.insertArticle(article);
    }
    //全表查询
    @RequestMapping(value = "findAllArticle",method = RequestMethod.POST)
    @ResponseBody
    public Object findAllArticle(){
        List<Article> allArticle = informationService.findAllArticle();
        return allArticle;
    }
    //多条件查询
    @RequestMapping(value = "selectBy",method = RequestMethod.GET)
    @ResponseBody
    public Object selectBy(@RequestParam String ss1,@RequestParam String ss2){
        List<Article> allArticle = informationService.selectBy(ss1,ss2);
        return allArticle;
    }

    //资讯审核数据展示
    @RequestMapping(value = "selectByUsername",method = RequestMethod.POST)
    @ResponseBody
    public Object selectByUsername(){
        List<AuditInformation> auditInformations = informationService.selectByUsername();
        return auditInformations;
    }

    //资讯审核数据展示
    @RequestMapping(value = "updateAuditInformation",method = RequestMethod.POST)
    @ResponseBody
    public String updateAuditInformation(@RequestBody AuditInformation information){
        System.out.println(information);
        informationService.updateArticle(information);
        return "审核成功";
    }
    //查询单条数据
    @RequestMapping(value = "selectById",method = RequestMethod.POST)
    @ResponseBody
    public Object selectById(@RequestParam Integer id){
        AuditInformation information = informationService.selectById(id);
        return information;
    }

    //查询单条数据
    @RequestMapping(value = "deleteArticleById",method = RequestMethod.POST)
    @ResponseBody
    public void deleteArticleById(@RequestParam Integer id){
        informationService.deleteArticleById(id);
    }
}
