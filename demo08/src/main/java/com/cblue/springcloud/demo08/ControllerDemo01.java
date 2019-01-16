package com.cblue.springcloud.demo08;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot支持Web开发的例子
 */
@RestController
public class ControllerDemo01 {

    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "hello spring boot";
    }

}
