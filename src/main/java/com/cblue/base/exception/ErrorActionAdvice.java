package com.cblue.base.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ErrorActionAdvice {


    @ExceptionHandler(Exception.class)
    public ModelAndView error1() {
        System.out.println("ErrorActionAdvice--error1");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "未知异常处理");
        mv.setViewName("error");
        return mv;
    }

    @ExceptionHandler(MyException.class)
    public ModelAndView error2() {
        System.out.println("ErrorActionAdvice--error2");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "自定义异常处理");
        mv.setViewName("error");
        return mv;
    }


}
