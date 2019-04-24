package com.qf.withmycar.controller;

import com.qf.withmycar.pojo.CarBrand;
import com.qf.withmycar.service.CarBrandService;
import com.qf.withmycar.utils.Util;
import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class carBrandController {
    @Autowired
    CarBrandService carBrandService;

    @RequestMapping(value = "insertCarBrand",method = RequestMethod.POST)
    @ResponseBody
    public boolean insertCarBrand(HttpServletRequest request, @RequestParam("realImg")MultipartFile file) throws IOException, ParseException {
        String namea = request.getParameter("namea");
        String englishName = request.getParameter("englishName");
        String brandIntro = request.getParameter("brandIntro");
        String logoMeans = request.getParameter("logoMeans");
        Integer countryId = Integer.parseInt(request.getParameter("countryId"));
        String picLoc = Util.FormData(file, request);
        CarBrand carBrand = new CarBrand();
        carBrand.setEnglishName(englishName);
        carBrand.setCountryId(countryId);
        carBrand.setLogoMeaning(logoMeans);
        carBrand.setIntroduction(brandIntro);
        carBrand.setNamea(namea);
        carBrand.setLogoUrl(picLoc);
        String firstSpell = PinYinUtil.getFirstSpell(namea);
        String fullSpell = PinYinUtil.getFullSpell(namea);
        if (firstSpell.equals("zc")){
            firstSpell="cc";
        }
        if (fullSpell.equals("zhangcheng")){
            fullSpell="changcheng";
        }
        carBrand.setFirstChar(firstSpell.substring(0,1));
        carBrand.setAllSpell(firstSpell);
        carBrand.setNameAllSpell(fullSpell);
/*        Date sqltime= new java.sql.Date(new java.util.Date().getTime());
        carBrand.setCreateTime((java.sql.Date) sqltime);*/
        Date date = new Date(new Timestamp(new Date().getTime()).getTime());
        carBrand.setCreateTime(date);
        carBrand.setUpdateTime(date);
        return carBrandService.insertSelective(carBrand);
    }

    /*查询全部品牌信息*/
    @RequestMapping(value = "selectAllBrands",method = RequestMethod.POST)
    @ResponseBody
    public Object selectAllBrands(){
       return carBrandService.selectAllBrands();
    }
    /*根据id查询一条品牌信息*/
    @RequestMapping(value = "selectBrandById",method = RequestMethod.GET)
    @ResponseBody
    public Object selectBrandById(@RequestParam Integer id){
        return carBrandService.selectByPrimaryKey(id);
    }
    /*修改品牌信息*/
    @RequestMapping(value = "updateCarBrand",method = RequestMethod.POST)
    @ResponseBody
    public boolean updateCarBrand(HttpServletRequest request, @RequestParam("realImg1")MultipartFile file) throws IOException {

        String namea = request.getParameter("namea");
        String englishName = request.getParameter("englishName");
        String brandIntro = request.getParameter("introduction");
        String logoMeans = request.getParameter("logoMeaning");
        Integer id = Integer.parseInt(request.getParameter("id"));
        Integer countryId = Integer.parseInt(request.getParameter("countryId"));
        CarBrand carBrand = new CarBrand();
        String picLoc = Util.FormData(file, request);
        carBrand.setId(id);
        carBrand.setEnglishName(englishName);
        carBrand.setCountryId(countryId);
        carBrand.setLogoMeaning(logoMeans);
        carBrand.setIntroduction(brandIntro);
        carBrand.setLogoUrl(picLoc);
        carBrand.setNamea(namea);
        String firstSpell = PinYinUtil.getFirstSpell(namea);
        String fullSpell = PinYinUtil.getFullSpell(namea);
        if (firstSpell.equals("zc")){
            firstSpell="cc";
        }
        if (fullSpell.equals("zhangcheng")){
            fullSpell="changcheng";
        }
        carBrand.setFirstChar(firstSpell.substring(0,1));
        carBrand.setAllSpell(firstSpell);
        carBrand.setNameAllSpell(fullSpell);
/*        Date sqltime= new java.sql.Date(new java.util.Date().getTime());
        carBrand.setCreateTime((java.sql.Date) sqltime);*/
        carBrand.setUpdateTime(new Date(new Timestamp(new Date().getTime()).getTime()));
        return carBrandService.updateByPrimaryKeySelective(carBrand);
        //return true;
    }
    /*删一条品牌信息*/
    @RequestMapping(value = "deleteCarBrand",method = RequestMethod.GET)
    @ResponseBody
    public boolean deleteCarBrand(@RequestParam Integer id){
        return carBrandService.deleteByPrimaryKey(id);
    }

    @RequestMapping(value = "findBrandList1",method = RequestMethod.GET)
    @ResponseBody
    public Object findBrandList1(@RequestParam Integer countryId,@RequestParam String namea){
        CarBrand carBrand = new CarBrand();
        carBrand.setCountryId(countryId);
        carBrand.setNamea(namea);
        return carBrandService.mohu(carBrand);
    }
}


class PinYinUtil {
    /**
     * 获取汉字串拼音首字母，英文字符不变
     *
     * @param chinese 汉字串
     * @return 汉语拼音首字母
     */
    public static String getFirstSpell(String chinese) {
        StringBuffer pybf = new StringBuffer();
        char[] arr = chinese.toCharArray();
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 128) {
                try {
                    String[] temp = PinyinHelper.toHanyuPinyinStringArray(arr[i], defaultFormat);
                    if (temp != null) {
                        pybf.append(temp[0].charAt(0));
                    }
                } catch (BadHanyuPinyinOutputFormatCombination e) {
                    e.printStackTrace();
                }
            } else {
                pybf.append(arr[i]);
            }
        }
        return pybf.toString().replaceAll("\\W", "").trim();
    }

    /**
     * 获取汉字串拼音，英文字符不变
     * @param chinese 汉字串
     * @return 汉语拼音
     */
    public static String getFullSpell(String chinese) {
        StringBuffer pybf = new StringBuffer();
        char[] arr = chinese.toCharArray();
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 128) {
                try {
                    pybf.append(PinyinHelper.toHanyuPinyinStringArray(arr[i], defaultFormat)[0]);
                } catch (BadHanyuPinyinOutputFormatCombination e) {
                    e.printStackTrace();
                }
            } else {
                pybf.append(arr[i]);
            }
        }
        return pybf.toString();
    }
}
