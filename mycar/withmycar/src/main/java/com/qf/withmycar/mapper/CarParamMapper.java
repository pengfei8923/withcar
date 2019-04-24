package com.qf.withmycar.mapper;

import com.qf.withmycar.dto.LpfCarParamDto;
import com.qf.withmycar.pojo.CarParam;
import com.qf.withmycar.pojo.PageInfo;

import java.util.List;

public interface CarParamMapper {
    int deleteByPrimaryKey(Integer paramid);
    int insert(CarParam record);
    /*添加汽车参数*/
    int insertSelective(CarParam record);
    CarParam selectByPrimaryKey(Integer paramid);
    /*根据参数对象 查 参数对象*/
    CarParam selectCarParamlpf(CarParam carParam);
    int updateByPrimaryKeySelective(CarParam record);
    int updateByPrimaryKey(CarParam record);

    /**
     * 遍历汽车参数管理网页显示表
     * @return
     */
    public List<LpfCarParamDto> getCarParamDto();

    /**
     * 分页遍历汽车参数管理网页显示表
     * @param pageInfo
     * @return
     */
    public List<LpfCarParamDto> getCarParamDtoPage(PageInfo pageInfo);

    /**
     * 根据参数编号查所属的类
     * @param paramid 参数编号
     * @return 参数类别编号
     */
    public Integer selectCarPacNameByParamid(Integer paramid);
}