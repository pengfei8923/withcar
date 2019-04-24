package com.qf.withmycar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.qf.withmycar.mapper"})
public class WithmycarApplication {

    public static void main(String[] args) {
        SpringApplication.run(WithmycarApplication.class, args);
    }

}
