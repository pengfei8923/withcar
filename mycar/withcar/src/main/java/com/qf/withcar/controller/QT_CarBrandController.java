package com.qf.withcar.controller;

import com.qf.withcar.service.QT_CarBrandService;
import com.qf.withmycar.dto.QT_CarBrand_FirstCharDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class QT_CarBrandController {
    @Autowired
    QT_CarBrandService qt_carBrandService;

    @RequestMapping(value = "selectBrandFirstChar",method = RequestMethod.POST)
    @ResponseBody
    public Object selectBrandFirstChar(){
        List<String> strings = qt_carBrandService.selectBrandFirstChar();
        for (String s:
             strings) {
            System.out.println(s);
        }
        return qt_carBrandService.selectBrandFirstChar();
    }
    /**/
    @RequestMapping(value = "selectCbByFirstChar",method = RequestMethod.GET)
    @ResponseBody
    public Object selectCbByFirstChar(@RequestParam String element){
        System.out.println(element);
        List<QT_CarBrand_FirstCharDto> aa = qt_carBrandService.selectCbByFirstChar(element);
        System.out.println(aa);
        return aa;
    }
    /*根据品牌查询厂商 */
    @RequestMapping(value = "selectFactorysBybrandId",method = RequestMethod.GET)
    @ResponseBody
    public Object selectFactoryBybrandId(@RequestParam Integer cbid){
        return qt_carBrandService.selectFactoryBybrandId(cbid);
    }
    /*根据厂商查询车系*/
    @RequestMapping(value = "selectAllsByFacId",method = RequestMethod.GET)
    @ResponseBody
    public Object selectAllByFacId(@RequestParam Integer facId){
        return qt_carBrandService.selectAllByFacId(facId);
    }
}
