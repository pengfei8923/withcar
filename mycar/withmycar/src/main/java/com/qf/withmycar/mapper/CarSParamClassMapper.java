package com.qf.withmycar.mapper;

import com.qf.withmycar.pojo.CarSParamClass;
import com.qf.withmycar.vo.CardetailsVo;
import com.qf.withmycar.vo.Lpf_CarModelsConfig_VO;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedList;
import java.util.List;

public interface CarSParamClassMapper {
    int deleteByPrimaryKey(Integer carpcid);
    int insert(CarSParamClass record);

    /**
     * 添加车款配置
     * @param record
     * @return
     */
    int insertSelective(CarSParamClass record);

    /**
     * 根据车款id查询
     * @param carid 车款id
     * @return
     */
    List<CarSParamClass> selectByPrimaryKey(Integer carid);

    /**
     * 修改车款参数
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(CarSParamClass record);

    int updateByPrimaryKey(CarSParamClass record);

    /**
     * 查询所有车款对应的配置表格
     * @return
     */
    LinkedList<Lpf_CarModelsConfig_VO> selectCarModelsConfig();

    /**
     * 前台查询参数配置
     * @return
     */
    List<CardetailsVo> selectCarDetailsconfigByc(@Param("pacid") int pacid,@Param("carid") int carid);



}