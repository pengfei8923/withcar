package com.qf.withmycar.controller;

import com.qf.withmycar.pojo.Tag;
import com.qf.withmycar.service.TagService;
import com.qf.withmycar.vo.TagVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TagController {
    @Autowired
    TagService tagService;

    /*标签管理*/
    @RequestMapping("/biaoqianguanli")
    public String biaoqianguanli(Model model) {
        List<TagVo> tags = tagService.selectTagXiTong();
        model.addAttribute("tag1", tags);
        List<TagVo> tags1 = tagService.selectTagYongHu();
        model.addAttribute("tag2", tags1);
        return "gt_biaoqianguanli";
    }

    @RequestMapping("selectId")
    @ResponseBody
    public String selectId(@RequestParam Integer id) {
        Integer type = tagService.selectId(id);
//        System.out.println(type);
        if (type == 1) {
            tagService.updateTag(new Tag(id, 0));
            return "true";
        } else if (type == 0) {
            tagService.updateTag(new Tag(id, 1));
            return "true";
        }
        return "false";

    }

    @RequestMapping("addTag")
    @ResponseBody
    public String addTag(@RequestBody Tag tag) {
//        System.out.println(tag);
        String name = tag.getName();
//        System.out.println(name);
        String s = tagService.selectName(name);
//        System.out.println(s);
        if (s != null) {
            return "false";
        }
        tagService.addTag(tag);
        return "true";

    }

    @RequestMapping("updateTag")
    @ResponseBody
    public Object updateTag(@RequestBody Tag tag1) {
        System.out.println(tag1);
        tagService.updateTag(tag1);
        return true;

    }

    @RequestMapping("deleteTag")
    @ResponseBody
    public Object deleteTag(@RequestParam Integer id) {
        tagService.deleteTag(id);
        return true;

    }

    @RequestMapping("selectName")
    @ResponseBody
    public Object selectName(@RequestParam String name) {

        return true;

    }

    @RequestMapping("selectTagMoHu")
    @ResponseBody
    public Object selectTagMoHu(Model model,@RequestParam String name) {
        System.out.println(name);
        List<TagVo> tagVos = tagService.selectTagMoHu(name);
        System.out.println(tagVos);
        model.addAttribute("tag1",tagVos);
        return "gt_biaoqianguanli";

    }
    /*标签定义*/
    @RequestMapping("/biaoqiandingyi")
    public String biaoqiandingyi() {
        return "gt_biaoqiandingyi";
    }


}
