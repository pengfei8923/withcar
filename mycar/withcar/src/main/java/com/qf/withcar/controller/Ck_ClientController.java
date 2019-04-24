package com.qf.withcar.controller;

import com.qf.withcar.service.UserCarService;
import com.qf.withcar.service.UserService;
import com.qf.withmycar.dto.Ck_UserCar;
import com.qf.withmycar.dto.Ck_UserCollect;
import com.qf.withmycar.pojo.MemberCar;
import com.qf.withmycar.pojo.MemberProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class Ck_ClientController {
    //用户个人中心跳转页面 除了第一个 其余的必须登录才能进去
    @Autowired
    UserCarService carService;
    @Autowired
    UserService userService;
    //去个人中心页面
    @RequestMapping(value = "goCenter")
    public String personalCenter(Model map) {
        //需要查询用户的登录名 头像 积分
        long userId=1;
        MemberProfile memberProfile = userService.queryUserById(userId);
        map.addAttribute("member",memberProfile);
        return "/personalcenter";
    }

    //去我的座驾页面
    @RequestMapping(value = "goUserCar")
    public String userCar(Model map) {
        //根据用户id查询用户拥有的座驾
        long userId=1;
        List<Ck_UserCar> ck_userCars = carService.selectUserCarByUserId(userId);
        int size = ck_userCars.size();
        map.addAttribute("usercars",ck_userCars);
        map.addAttribute("size",size);
        //期待座驾。。。。
        return "/usercar";
    }
    //去我的活动页面
    @RequestMapping(value = "goUserActi")
    public String userActivities(Model map) {
        long id=1;
        List<Ck_UserCollect> myActivities = carService.getMyActivities(id);
        map.addAttribute("activit",myActivities);
        //查询用户收藏的活动
        return "/useractivities";
    }

    //去我的咨询收藏
    @RequestMapping(value = "goUserArticle")
    public String goUserArticle(Model model) {
        long id=1;
        List<Ck_UserCollect> myZiXun = carService.getMyZiXun(id);
        model.addAttribute("ziXun",myZiXun);
        return "/userarticle";
    }
    //去我的关注车型
    @RequestMapping(value = "goUserAttention")
    public String goUserAttention() {
        return "/userattentioncar";
    }
//车型大全   ** 应该是去查看车的页面

    //去消息 应该与登录与否无关
    @RequestMapping(value = "goInformation")
    public String goInformation() {
        return "/information";
    }
    //去设置页面  只有退出选择
    @RequestMapping(value = "goSetLogout")
    public String goSetLogout() {
        return "/setlogout";
    }






    //以下是我的座驾页面，增加我的座驾
    //根据品牌id 查询厂商
    @RequestMapping(value = "selectFactoryBybrandId",method = RequestMethod.GET)
    @ResponseBody
    public Object selectFactoryBybrandId(@RequestParam Integer brandId){
        return carService.selectFactoryBybrandId(brandId);
    }
    /*根据厂商id查询车系信息*/
    @RequestMapping(value = "selectCarSeriesByFacId",method = RequestMethod.GET)
    @ResponseBody
    public Object selectCarSeriesByFacId(@RequestParam Integer facId){
        return carService.selectCarSeriesByFacId(facId);
    }
    /*根据车系id查询当前的类型id和类型名称*/
    @RequestMapping(value = "selectTypeBySeries",method = RequestMethod.GET)
    @ResponseBody
    public Object selectTypeBySeries(@RequestParam Integer id){
        return carService.selectTypeBySeries(id);
    }

    /*子类型随主类型的变化而变化*/
    @RequestMapping(value = "selectChildren",method = RequestMethod.GET)
    @ResponseBody
    public Object selectChildren(@RequestParam Integer tyid){
        return carService.selectChildren(tyid);
    }

    /*根据车系id 获取车款信息*/
    @RequestMapping(value = "selectModelBySeries",method = RequestMethod.GET)
    @ResponseBody
    public Object selectModelBySeries(@RequestParam Integer id){
        return carService.selectModelBySeriesId(id);
    }

    /*查询所有品牌*/
    @RequestMapping(value = "selectAllBrands",method = RequestMethod.POST)
    @ResponseBody
    public Object selectAllBrands(){
        return carService.getAllBrands();
    }
    /*查询所有厂商*/
    @RequestMapping(value = "selectAllFactory",method = RequestMethod.POST)
    @ResponseBody
    public Object selectAllFactory(){
        return carService.getAllFactory();
    }
    /*查询所有车系*/
    @RequestMapping(value = "selectAllCarSeriesDto",method = RequestMethod.POST)
    @ResponseBody
    public Object selectAllCarSeriesDto(){
        return carService.getAllCarSeriesDto();
    }
    /*查询所有车款*/
    @RequestMapping(value = "selectAllCarModels",method = RequestMethod.POST)
    @ResponseBody
    public Object selectAllCarModels(){
        return carService.getAllCarModels();
    }
    /*查询所有类型*/
    @RequestMapping(value = "selectAllCarTypes",method = RequestMethod.POST)
    @ResponseBody
    public Object selectAllCarTypes(){
        return carService.getAllCarTypes();
    }
    /*查询所有二级类型*/
    @RequestMapping(value = "selectAllChildrenTypes",method = RequestMethod.POST)
    @ResponseBody
    public Object selectAllChildrenTypes(){
        return carService.getAllChildrenTypes();
    }

    //    会员新增座驾
    @RequestMapping(value = "addUserMyCar",method = RequestMethod.POST)
    @ResponseBody
    public Object addUserMyCar(HttpServletRequest request) throws IOException {
//, @RequestParam("realImg") MultipartFile file
        Integer brandId = Integer.parseInt(request.getParameter("brandId"));
        Integer carId = Integer.parseInt(request.getParameter("carId"));
        Integer makeId = Integer.parseInt(request.getParameter("makeId"));
        Integer modelId = Integer.parseInt(request.getParameter("modelId"));
        byte type = Byte.parseByte(request.getParameter("type"));
        Integer buyYear = Integer.parseInt(request.getParameter("buyYear"));
        String remark = request.getParameter("remark");
        Integer currentMileage = Integer.parseInt(request.getParameter("currentMileage"));
//        String picurl = Util.FormData(file, request);

        MemberCar memberCar = new MemberCar();

        memberCar.setMemberId(1l);

        memberCar.setBrandId(brandId);
        memberCar.setMakeId(makeId);
        memberCar.setCarId(carId);
        memberCar.setModelId(modelId);
        memberCar.setType(type);
        memberCar.setBuyYear(buyYear);
        memberCar.setRemark(remark);
        memberCar.setCurrentMileage(currentMileage);

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String format1 = format.format(date);
        memberCar.setCreateTime(format1);
        memberCar.setLastUpdateTime(format1);
        System.out.println(memberCar);
        carService.addMycar(memberCar);
        return "success";
    }
    //删除我的座驾
    @RequestMapping(value = "removeMyCar",method = RequestMethod.POST)
    @ResponseBody
    public String removeMyCar(@RequestParam Long id){
        carService.removeMyCar(id);
        return "success";
    }

    //删除我收藏的咨询或活动
    @RequestMapping(value = "removeMyCollect",method = RequestMethod.POST)
    @ResponseBody
    public String removeMyCollect(@RequestParam Long id){
        carService.removeMyCollect(id);
        return "success";
    }
}
