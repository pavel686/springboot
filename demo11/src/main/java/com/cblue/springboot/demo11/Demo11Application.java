package com.cblue.springboot.demo11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling    // 启用间隔调度
public class Demo11Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo11Application.class, args);
    }

}

