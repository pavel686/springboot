package com.cblue.base.aop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AOPController {


    @RequestMapping("/aop")
    public String getAOP() {
        System.out.println("getAOP-----");
        return "aaa";
    }
}
