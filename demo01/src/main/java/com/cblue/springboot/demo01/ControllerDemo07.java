package com.cblue.springboot.demo01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 获得内置对象
 */

@RestController
public class ControllerDemo07 {


    @RequestMapping(value = "getObject", method = RequestMethod.GET)
    public String getObject(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("request="+request);
        System.out.println("response="+response);
        return null;

    }



    


}
