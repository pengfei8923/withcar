package com.qf.withcar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.qf.withmycar.mapper"})
public class WithcarApplication {

    public static void main(String[] args) {
        SpringApplication.run(WithcarApplication.class, args);
    }

}
