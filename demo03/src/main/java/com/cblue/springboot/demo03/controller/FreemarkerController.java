package com.cblue.springboot.demo03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/freemark")
public class FreemarkerController {

    @GetMapping("/test01")
    public ModelAndView goTest01(ModelAndView mv){
        mv.addObject("name","myfff");
        mv.setViewName("test");
        return mv;
    }
}
