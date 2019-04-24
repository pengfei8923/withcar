package com.qf.withcar.service.impl;

import com.qf.withcar.service.QT_CarBrandService;
import com.qf.withmycar.dto.QT_CarBrand_FirstCharDto;
import com.qf.withmycar.mapper.CarBrandMapper;
import com.qf.withmycar.mapper.CarModelsMapper;
import com.qf.withmycar.mapper.CarSeriesMapper;
import com.qf.withmycar.mapper.FactoryMapper;
import com.qf.withmycar.pojo.CarModels;
import com.qf.withmycar.pojo.CarSeries;
import com.qf.withmycar.pojo.Factory;
import com.qf.withmycar.vo.CarSeriesModelsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class QT_CarBrandServiceImpl implements QT_CarBrandService {
    @Autowired
    CarBrandMapper carBrandMapper;
    @Autowired
    FactoryMapper factoryMapper;
    @Autowired
    CarSeriesMapper carSeriesMapper;
    @Autowired
    CarModelsMapper carModelsMapper;
    @Override
    public List<String> selectBrandFirstChar() {
        return carBrandMapper.selectBrandFirstChar();
    }

    @Override
    public List<QT_CarBrand_FirstCharDto> selectCbByFirstChar(String element) {
        return carBrandMapper.selectCbByFirstChar(element);
    }

    @Override
    public List<Factory> selectFactoryBybrandId(Integer brandId) {
        return factoryMapper.selectFactoryBybrandId(brandId);
    }

    @Transactional
    @Override
    public List<CarSeriesModelsVo> selectAllByFacId(Integer facId) {
        List<CarSeries> carSeries = carSeriesMapper.selectCarSeriesByFacId(facId);
        System.out.println("carSeries:"+carSeries);
        List<CarModels> carModels;
        CarSeriesModelsVo carSeriesModelsVo=null;
        List<CarSeriesModelsVo> list=new ArrayList<>();
        for(int i=0;i<carSeries.size();i++) {
            double max=0;
            double min=3000;
            carModels = carModelsMapper.selectCarModelsBySeriesId(carSeries.get(i).getId());
            for (int j = 0; j < carModels.size(); j++) {
                carSeriesModelsVo = carModelsMapper.selectPrice(carModels.get(j).getCmid());
                String transHigh = QT_CarBrandServiceImpl.trans(carSeriesModelsVo.getHighPrice());
                String transLow = QT_CarBrandServiceImpl.trans(carSeriesModelsVo.getLowPrice());
                double high = Double.parseDouble(transHigh);
                double low = Double.parseDouble(transLow);
                if (high>max){
                    max=high;
                }
                if (low<min) {
                    min = low;
                }
            }
            carSeriesModelsVo.setHighPrice(String.valueOf(max));
            carSeriesModelsVo.setLowPrice(String.valueOf(min));
            carSeriesModelsVo.setId(carSeries.get(i).getId());
            carSeriesModelsVo.setSeriesName(carSeries.get(i).getSeriesName());
            System.out.println(carSeriesModelsVo);
            list.add(carSeriesModelsVo);
        }
    return list;
    }

    /*字符串提取中间的数字*/
    public static String trans(String msg) {
        // 需要取整数和小数的字符串
        String str = msg;
        // 控制正则表达式的匹配行为的参数(小数)
        Pattern p = Pattern.compile("(\\d+\\.\\d+)");
        //Matcher类的构造方法也是私有的,不能随意创建,只能通过Pattern.matcher(CharSequence input)方法得到该类的实例.
        Matcher m = p.matcher(str); //m.find用来判断该字符串中是否含有与"(\\d+\\.\\d+)"相匹配的子串
        if (m.find()) {
            //如果有相匹配的,则判断是否为null操作 //group()中的参数：0表示匹配整个正则，1表示匹配第一个括号的正则,2表示匹配第二个正则,在这只有一个括号,即1和0是一样的
            str = m.group(1) == null ? "" : m.group(1);
            return str;
        } else {
            //如果匹配不到小数，就进行整数匹配
            p = Pattern.compile("(\\d+)");
            m = p.matcher(str);
            if (m.find()) {
                //如果有整数相匹配
                str = m.group(1) == null ? "" : m.group(1);
                return str;
            } else {
                //如果没有小数和整数相匹配,即字符串中没有整数和小数，就设为空
                str = "";
                return str;
            }
        }
    }
}
