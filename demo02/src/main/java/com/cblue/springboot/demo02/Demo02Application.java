package com.cblue.springboot.demo02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class Demo02Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo02Application.class, args);
    }

}

