package com.cblue.springboot.demo04.controller;

import com.cblue.springboot.demo04.exception.MyException;
import com.cblue.springboot.demo04.pojo.Student;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Iterator;
import java.util.List;

@RestController
public class StudentController {


    @RequestMapping("/index")
    public ModelAndView index(ModelAndView mv){
        mv.setViewName("index");
        return mv;
    }


    @RequestMapping("/addStudent")
    public ModelAndView addStudent(@Valid Student student, BindingResult result, ModelAndView mv){
        System.out.println("111"+student);
        if (result.hasErrors()) { // 现在表示执行的验证出现错误
            List<ObjectError> errors = result.getAllErrors();
            Iterator<ObjectError> iterator = errors.iterator(); // 获取全部错误信息
            while (iterator.hasNext()) {
                ObjectError error = iterator.next();    // 取出每一个错误
                System.out.println("【错误信息】code = " + error.getCode() + "，message = " + error.getDefaultMessage());
            }
            //校验未通过
            mv.addObject("errors",result.getAllErrors());
            mv.setViewName("index");
        }else{
            //校验通过
            //保存数据
            mv.setViewName("welcome");
        }
        return mv;
    }


    @RequestMapping("/exception")
    public String exception() throws Exception {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
             throw new MyException("自定义异常");
        }
        return null;
    }



}
