package com.qf.withcar;

import com.qf.withcar.service.QT_CarBrandService;
import com.qf.withcar.service.UserService;
import com.qf.withcar.service.impl.QT_CarBrandServiceImpl;
import com.qf.withmycar.dto.QT_CarBrand_FirstCharDto;
import com.qf.withmycar.mapper.CarBrandMapper;
import com.qf.withmycar.pojo.MemberProfile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WithcarApplicationTests {
@Autowired
    UserService service;
@Autowired
    CarBrandMapper carBrandMapper;
@Autowired
QT_CarBrandService qt_carBrandService;
    @Test
    public void contextLoads() {
        MemberProfile memberProfile =  service.queryUserById(1);
        System.out.println(memberProfile);
    }
    @Test
    public void test1(){
        //List<QT_CarBrand_FirstCharDto> a = carBrandMapper.selectCbByFirstChar("a");
        List<QT_CarBrand_FirstCharDto> a = carBrandMapper.selectCbByFirstChar("a");
        System.out.println(a);

    }

}
