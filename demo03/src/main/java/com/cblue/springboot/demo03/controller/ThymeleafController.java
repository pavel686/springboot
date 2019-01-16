package com.cblue.springboot.demo03.controller;

import com.cblue.springboot.demo03.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/thymeleaf")
public class ThymeleafController {


    @RequestMapping("/simpleUse")
    public ModelAndView simpleUse(ModelAndView mv,HttpServletRequest request){
        mv.addObject("name","<b>AAA</b>");

        mv.addObject("today",new Date());

        User user = new User("hehe",20);
        request.setAttribute("user",user);

        mv.addObject("id",2);

        mv.addObject("isAdmin",false);

        //mv.addObject("role","student");
        mv.addObject("role","teacher");


        List<User> users = new ArrayList<User>();
        for (int i = 0; i < 3; i++) {
            users.add(new User("zhangsan"+i,i));
        }
        mv.addObject("users",users);
        mv.setViewName("userlist");

        mv.setViewName("index");
        return mv;
    }

}
