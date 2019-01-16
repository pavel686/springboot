package com.cblue.springboot.demo04.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ErrorActionAdvice {


    @ExceptionHandler(MyException.class)
    public ModelAndView handler(HttpServletRequest request, Exception e) {
        System.out.println("ErrorActionAdvice--error2");
        ModelAndView mv = new ModelAndView();
        mv.addObject("url", request.getRequestURL()); // 获得请求的路径
        mv.addObject("exception",e);
        mv.addObject("message", "自定义异常处理");
        mv.setViewName("exception");
        return mv;
    }


}
