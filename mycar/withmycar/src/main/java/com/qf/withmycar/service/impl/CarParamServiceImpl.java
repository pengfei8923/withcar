package com.qf.withmycar.service.impl;

import com.qf.withmycar.dto.LpfCarParamDto;
import com.qf.withmycar.mapper.CarParamMapper;
import com.qf.withmycar.mapper.CarParamandclassMapper;
import com.qf.withmycar.pojo.CarParam;
import com.qf.withmycar.pojo.CarParamandclass;
import com.qf.withmycar.pojo.PageInfo;
import com.qf.withmycar.service.CarParamService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarParamServiceImpl implements CarParamService {
    @Autowired
   private CarParamMapper carParamMapper;

    @Autowired
    private CarParamandclassMapper carParamandclassMapper;

    /**
     * 添加汽车参数
     * @param record
     * @return
     */
    @Override
    @Transactional
    public int insertSelective(CarParam record) {
        int i = carParamMapper.insertSelective(record);
        return i;
    }
    /**
     * 添加汽车参数+参数类型_参数 中间表
     * @param pacid  参数分类id
     * @param carParam 参数名称
     * @return
     */
    @Override
    @Transactional
    public int insertSelective(String pacid, String carParam) {
        //json转carParam对象
        JSONObject jsonObject = JSONObject.fromObject(carParam);
        CarParam carParams = (CarParam) JSONObject.toBean(jsonObject, CarParam.class);
        //添加carParam对象
        int i = carParamMapper.insertSelective(carParams);
        if(i<=0){
            return -1;
        }
        //查询刚刚添加对象的id
        CarParam selectCarParam = carParamMapper.selectCarParamlpf(carParams);
        Integer paramid = selectCarParam.getParamid();
        //排序id
        StringBuilder paramidlpf = new StringBuilder();
        if(paramid<10){
            paramidlpf.append(pacid).append("0").append("0").append(paramid);
        }else if(paramid<100){
            paramidlpf.append(pacid).append("0").append(paramid);
        } else {
            paramidlpf.append(pacid).append(paramid);
        }
        //添加 参数类型_参数 中间表
        CarParamandclass carParamandclass = new CarParamandclass();
        carParamandclass.setPacid(Integer.parseInt(pacid));//参数类型id
        carParamandclass.setParamid(paramid);//参数id
        carParamandclass.setCpcsortid(Integer.parseInt(paramidlpf.toString()));//排序id
        int i1 = carParamandclassMapper.insertSelective(carParamandclass);
        return i1;
    }

    /**
     * 遍历汽车参数管理网页显示表
     * @param pageNum 每页的数量
     * @return 分页总数
     */
    @Override
    @Transactional
    public Integer getCarParamPages(Integer pageNum){
        Integer pages;
        List<LpfCarParamDto> carParamDto = carParamMapper.getCarParamDto();
        int size = carParamDto.size();
        if(size % pageNum == 0){
            pages = size / pageNum ;
        } else {
            pages = size / pageNum + 1;
        }
        return pages;
    }
    /**
     * 分页遍历汽车参数管理网页显示表
     * @return
     */
    @Override
    @Transactional
    public List<LpfCarParamDto> getCarParamDtoPage(Integer page, Integer pageNum) {
        PageInfo pageInfo = new PageInfo();
        page = (page - 1) * pageNum;
        pageInfo.setPage(page);
        pageInfo.setPageNum(pageNum);
        List<LpfCarParamDto> carParamDtoPage = carParamMapper.getCarParamDtoPage(pageInfo);
        return carParamDtoPage;
    }
    /**
     * 根据参数编号查所属的类
     * @param paramid 参数编号
     * @return 参数类别编号
     */
    @Override
    @Transactional
    public Integer selectCarPacNameByParamid(Integer paramid) {
        Integer integer = carParamMapper.selectCarPacNameByParamid(paramid);
        return integer;
    }

    /**
     * 修改参数类型
     * @param carParamDto
     * @return
     */
    @Override
    @Transactional
    public Integer editCarParam(LpfCarParamDto carParamDto) {
        /*获取值*/
            //参数值
        Integer paramid = carParamDto.getParamid();
        String paramname = carParamDto.getParamname();
        String paramstate = carParamDto.getParamstate();
        String parambase = carParamDto.getParambase();
            //参数类型id
        Integer pacid = carParamDto.getPacid();
        /*修改二级参数表carParam*/
        CarParam carParam = new CarParam();
        carParam.setParamid(paramid);
        carParam.setParamname(paramname);
        carParam.setParamstate(paramstate);
        carParam.setParambase(parambase);
        CarParam carParamtwo = carParamMapper.selectByPrimaryKey(paramid);
        System.out.println(carParam);
        System.out.println(pacid);

        if(!carParam.equals(carParamtwo)){
            System.out.println("修改carParam");
            int i = carParamMapper.updateByPrimaryKeySelective(carParam);
        }else{//如果相同即未改变，则不保存
            CarParamandclass selectCarParamandclass = carParamandclassMapper.selectPACByParamid(paramid);
            Integer selectPacid = selectCarParamandclass.getPacid();
            if(selectPacid == pacid){
                System.out.println("返回");
                return 1;
            }
        }
        /*修改参数类型+参数 中间表*/
            //排序id
        StringBuilder paramidlpf = new StringBuilder();
        if(paramid<10){
            paramidlpf.append(pacid).append("0").append("0").append(paramid);
        }else if(paramid<100){
            paramidlpf.append(pacid).append("0").append(paramid);
        } else {
            paramidlpf.append(pacid).append(paramid);
        }
        int i2 = carParamMapper.updateByPrimaryKeySelective(carParam);
        /*删除  参数类型_参数 中间表*/
        Integer i3 = carParamandclassMapper.delCarPACByParamid(paramid);
        /*添加 参数类型_参数 中间表*/
        CarParamandclass carParamandclass = new CarParamandclass();
        carParamandclass.setPacid(pacid);//参数类型id
        carParamandclass.setParamid(paramid);//参数id
        carParamandclass.setCpcsortid(Integer.parseInt(paramidlpf.toString()));//排序id
        int i4 = carParamandclassMapper.insertSelective(carParamandclass);
        System.out.println("修改完成");
        return i4;
    }

    /**
     * 删除汽车参数+参数类型_参数 中间表
     * @param paramid
     * @return
     */
    @Override
    @Transactional
    public Integer delCarPACByParamid(Integer paramid) {
        //1.删除汽车参数
        int i = carParamMapper.deleteByPrimaryKey(paramid);
        //2.删除 参数类型_参数 中间表
        Integer integer = carParamandclassMapper.delCarPACByParamid(paramid);
        return integer;
    }


}
