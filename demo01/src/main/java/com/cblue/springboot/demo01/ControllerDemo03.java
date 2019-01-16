package com.cblue.springboot.demo01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主配置文件中属性引用属性
 */
@RestController
public class ControllerDemo03 {



    @Value("${user.info}")
    private String info;

    @RequestMapping(value = "/getInfo", method = RequestMethod.GET)
    public String sayHello() {
      System.out.println("info=" + info);
        return null;
    }

}
