package com.cblue.springboot.demo01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 主配置文件中获得自定义属性
 */
@RestController
public class ControllerDemo02 {

    @Value("${name}")
    private String name;

    @RequestMapping(value = "/getValue", method = RequestMethod.GET)
    public String sayHello() {
        System.out.println("name＝" + name);
        return null;
    }

}
