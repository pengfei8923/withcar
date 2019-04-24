package com.qf.withmycar.service;

import com.qf.withmycar.dto.LpfCarParamDto;
import com.qf.withmycar.pojo.CarParam;

import java.util.List;

public interface CarParamService {
    /*添加汽车参数*/
    int insertSelective(CarParam record);

    /**
     * 添加汽车参数+参数类型_参数 中间表
     * @param pacid  参数分类id
     * @param carParam 参数名称
     * @return
     */
    int insertSelective(String pacid, String carParam);

    /**
     * 求分页总数
     * @param pageNum 每页的数量
     * @return
     */
    public Integer getCarParamPages(Integer pageNum);

    /**
     * 遍历汽车参数管理网页显示表——分页
     * @return
     */
    public List<LpfCarParamDto> getCarParamDtoPage(Integer page, Integer pageNum);

    /**
     * 根据参数编号查所属的类
     * @param paramid 参数编号
     * @return 参数类别编号
     */
    public Integer selectCarPacNameByParamid(Integer paramid);

    /**
     * 修改参数类型
     * @param carParamDto
     * @return
     */
    public Integer editCarParam(LpfCarParamDto carParamDto);

    /**
     * 删除汽车参数+参数类型_参数 中间表
     * @param paramid
     * @return
     */
    public Integer delCarPACByParamid(Integer paramid);
}
