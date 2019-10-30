package com.ciec.prepaid.web;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ciec.prepaid")
@MapperScan("com.ciec.prepaid.dao.mapper")
public class PrepaidWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrepaidWebApplication.class, args);
    }
}

