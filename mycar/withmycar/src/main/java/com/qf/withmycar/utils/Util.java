package com.qf.withmycar.utils;

import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

public class Util {
    public static String FormData(MultipartFile fileOne, HttpServletRequest request) throws IOException {
        String fileName = fileOne.getOriginalFilename();//文件名
        String names[]=fileName.split("\\.");//截取文件后缀+"."+names[names.length-1]
        //获取跟目录
        File path = new File(ResourceUtils.getURL("classpath:").getPath());
        if(!path.exists()) path = new File("");
        System.out.println("path:"+path.getAbsolutePath());
        //如果上传目录为/static/images/uploadgoods/，则可以如下获取：
        File upload = new File(path.getAbsolutePath(),"static/htstatic/images/upload");
        if(!upload.exists()) upload.mkdirs();
        // 自定义的文件名称
        String trueFileName= new Date().getTime()+ "_" + UUID.randomUUID().toString().replaceAll("-", "") +"."+names[names.length-1];
        // 设置存放图片文件的路径
        String imgpath=upload.getAbsolutePath()+"/"+trueFileName;
        System.out.println("imgpath:"+imgpath);
        File file = new File(imgpath);
        if(!file.getParentFile().exists()){
            file.mkdirs();
        }
        fileOne.transferTo(file);//储存文件
        System.out.println(trueFileName+"上传成功");
        return "/htstatic/images/upload/"+trueFileName;//返回文件路径
    }



    public static String FormDataTwo(MultipartFile fileOne, HttpServletRequest request) throws IOException {
        String fileName = fileOne.getOriginalFilename();//文件名
        String names[]=fileName.split("\\.");//截取文件后缀+"."+names[names.length-1]
        //获取跟目录
        File path = new File("E:\\work\\bmycar\\mycar\\withcar\\src\\main\\resources\\static\\htstatic\\images\\upload");
        if(!path.exists()) path = new File("");
        System.out.println("path:"+path.getAbsolutePath());
        //如果上传目录为/static/images/uploadgoods/，则可以如下获取：
//        File upload = new File(path.getAbsolutePath(),"static/htstatic/images/upload");
//        if(!upload.exists()) upload.mkdirs();
        // 自定义的文件名称
        String trueFileName= new Date().getTime()+ UUID.randomUUID().toString().replaceAll("-", "") +"."+names[names.length-1];
        // 设置存放图片文件的路径
        String imgpath=path.getAbsolutePath()+"/"+trueFileName;
        System.out.println("imgpath:"+imgpath);
        File file = new File(imgpath);
        if(!file.getParentFile().exists()){
            file.mkdirs();
        }
        fileOne.transferTo(file);//储存文件
        System.out.println(trueFileName+"上传成功");
        return trueFileName;//返回文件路径
    }
}
