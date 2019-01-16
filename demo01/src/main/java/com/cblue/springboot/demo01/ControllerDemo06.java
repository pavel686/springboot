package com.cblue.springboot.demo01;

import org.springframework.web.bind.annotation.*;

/**
 * 热部署
 */

@RestController
public class ControllerDemo06 {


    @RequestMapping(value = "getParam03", method = RequestMethod.GET)
    public String getParam() {
        System.out.println("222");
        return null;

    }



    


}
