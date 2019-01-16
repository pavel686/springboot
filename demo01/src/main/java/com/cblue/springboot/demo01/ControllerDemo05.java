package com.cblue.springboot.demo01;

import org.springframework.web.bind.annotation.*;

/**
 * 获得参数
 */

@RestController
public class ControllerDemo05 {


    @RequestMapping(value = "getParam", method = RequestMethod.GET)
    public String getParam(@RequestParam(value = "username", required = true) String userName) {
        System.out.println("username: " + userName);
        return null;

    }


    @GetMapping(value = "/getParamRestful/{param}")
    public String getParamRestful(@PathVariable String param) {
        System.out.println("param="+param);
        return null;
    }



}
