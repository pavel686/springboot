package com.cblue.springboot.demo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获得主配置文件中的对象属性
 */

@RestController
public class ControllerDemo04 {

    @Autowired
    private User user;

    @RequestMapping(value = "/getUser")
    public User getUser() {
        return user;
    }


}
