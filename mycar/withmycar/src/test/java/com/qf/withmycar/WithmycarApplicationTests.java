package com.qf.withmycar;

import com.qf.withmycar.dto.QT_CarBrand_FirstCharDto;
import com.qf.withmycar.mapper.CarBrandMapper;
import com.qf.withmycar.pojo.ActivityCategory;
import com.qf.withmycar.pojo.ActivityChannel;
import com.qf.withmycar.service.ActivityChannelService;
import com.qf.withmycar.service.ActivityListService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WithmycarApplicationTests {

    @Autowired
    private ActivityListService a;
    @Autowired
    ActivityChannelService activityChannelService;
    @Autowired
    CarBrandMapper carBrandMapper;
    @Test
    public void contextLoads() {
//        List<ActivityCategory> list = a.selectActivityCategoryLike("宝马");
//        System.out.println(list);
        List<ActivityChannel> activityChannels = activityChannelService.selectActivityChannels();
        System.out.println(activityChannels);
    }

    @Test
    public void test1(){
        //List<QT_CarBrand_FirstCharDto> a = carBrandMapper.selectCbByFirstChar("a");
        List<String> a = carBrandMapper.selectBrandFirstChar();
        System.out.println(a);


    }
}
