package com.qf.withmycar.service.impl;

import com.qf.withmycar.mapper.CarParamclassMapper;
import com.qf.withmycar.mapper.CarSParamClassMapper;
import com.qf.withmycar.pojo.CarParamclass;
import com.qf.withmycar.pojo.CarSParamClass;
import com.qf.withmycar.service.CarSParamClassService;
import com.qf.withmycar.vo.Lpf_CarModelsConfig_VO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class CarSParamClassServiceImpl implements CarSParamClassService {
    @Autowired
    private CarSParamClassMapper carSParamClassMapper;
    @Autowired
    private CarParamclassMapper carParamclassMapper;

    /**
     * 查询所有车款对应的配置表格
     * @return
     */
    @Override
    public LinkedHashMap<String,List<Lpf_CarModelsConfig_VO>> selectCarModelsConfig(){
        LinkedHashMap<String, List<Lpf_CarModelsConfig_VO>> listHashMap = new LinkedHashMap<>();
        List<CarParamclass> carParamclasses = carParamclassMapper.selectCarParamclass();
        LinkedList<Lpf_CarModelsConfig_VO> config_voList = carSParamClassMapper.selectCarModelsConfig();
        for(int i=0; i<carParamclasses.size(); i++){
            List<Lpf_CarModelsConfig_VO> voList = new ArrayList<>();
//            System.out.println(carParamclasses.get(i));
            for(int j=0; j<config_voList.size(); j++){
                if(carParamclasses.get(i).getPacid() == config_voList.get(j).getPacid()){
                    Lpf_CarModelsConfig_VO lpf_carModelsConfig_vo = config_voList.get(j);
                    voList.add(lpf_carModelsConfig_vo);
//                    System.out.println(lpf_carModelsConfig_vo);
                }
            }
            String pacname = carParamclasses.get(i).getPacname();
            listHashMap.put(pacname,voList);
//            voList.clear();
        }
        return listHashMap;
    }

    /**
     * 添加车款配置
     * @param carSParamClasses
     * @return
     */
    @Override
    @Transactional
    public Integer addCarSParamClass(List<CarSParamClass> carSParamClasses) {
        Integer carid = carSParamClasses.get(0).getCarid();
        List<CarSParamClass> list = carSParamClassMapper.selectByPrimaryKey(carid);
        if(list.size()>0){//如果存在则修改
            /*修改*/
            for (CarSParamClass ss:carSParamClasses) {
                Integer integer = carSParamClassMapper.updateByPrimaryKeySelective(ss);
            }
            return 1;
        }else{
            /*第一次编辑*/
            for (CarSParamClass ss:carSParamClasses) {
                Integer integer = carSParamClassMapper.insertSelective(ss);
            }
            return 1;
        }
    }
    /**
     * 根据车款id查询
     * @param carid 车款id
     * @return
     */
    @Override
    @Transactional
    public List<CarSParamClass> selectByPrimaryKey(Integer carid) {
        List<CarSParamClass> list = carSParamClassMapper.selectByPrimaryKey(carid);
        return list;
    }

    /**
     * 修改车款参数
     * @param record
     * @return
     */
    @Override
    public Integer updateCarSParamClass(CarSParamClass record) {
        Integer integer = carSParamClassMapper.updateByPrimaryKeySelective(record);
        return integer;
    }

}
