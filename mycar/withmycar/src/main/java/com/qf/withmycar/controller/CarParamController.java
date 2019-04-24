package com.qf.withmycar.controller;

import com.qf.withmycar.dto.LpfCarParamDto;
import com.qf.withmycar.pojo.CarParam;
import com.qf.withmycar.pojo.PageInfo;
import com.qf.withmycar.service.CarParamService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarParamController {

    @Autowired
    private CarParamService carParamService;

    /**
     * 1.添加carParam对象
     * 2.添加 参数类型_参数 中间表
     * @param request
     * @return
     */
    @RequestMapping(value = "lpfaddCarParam",method = RequestMethod.POST)
    @ResponseBody
    public int insertSelective(HttpServletRequest request) {
        String pacids = request.getParameter("pacids");
        String carParam = request.getParameter("carParam");
        int i = carParamService.insertSelective(pacids, carParam);
        return i;
    }

    /**
     * 遍历汽车参数管理网页显示表
     * @return
     */
    @RequestMapping(value = "getCarParamPages",method = RequestMethod.POST)
    @ResponseBody
    public Integer getCarParamPages(@RequestParam Integer pageNum) {
        Integer pages = carParamService.getCarParamPages(pageNum);
        return pages;
    }

    /**
     * 分页查询参数类型
     * @param page
     * @param pageNum
     * @return
     */
    @RequestMapping(value = "getCarParamByPage",method = RequestMethod.POST)
    @ResponseBody
    public List<LpfCarParamDto> getCarParamDtoPage(@RequestParam Integer page,@RequestParam Integer pageNum){
        List<LpfCarParamDto> carParamDto = carParamService.getCarParamDtoPage(page,pageNum);
        return carParamDto;
    }

    /**
     * 根据参数编号查所属的类
     * @param paramid 参数编号
     * @return 参数类别编号
     */
    @RequestMapping(value = "getCarPacNameByParamid",method = RequestMethod.POST)
    @ResponseBody
    public Integer selectCarPacNameByParamid(@RequestParam Integer paramid) {
        Integer integer = carParamService.selectCarPacNameByParamid(paramid);
        return integer;
    }

    /**
     * 修改参数类型
     * @param lpfCarParamDto
     * @return
     */
    @RequestMapping(value = "editCarParam",method = RequestMethod.POST)
    @ResponseBody
    public Integer editCarParam(@RequestBody LpfCarParamDto lpfCarParamDto){
        Integer i = carParamService.editCarParam(lpfCarParamDto);
        return i;
    }

    /**
     * 删除汽车参数+参数类型_参数 中间表
     * @param paramid
     * @return
     */
    @RequestMapping(value = "delCarPACByParamid",method = RequestMethod.POST)
    @ResponseBody
    public Integer delCarPACByParamid(@RequestParam Integer paramid){
        Integer integer = carParamService.delCarPACByParamid(paramid);
        return integer;
    }
}
