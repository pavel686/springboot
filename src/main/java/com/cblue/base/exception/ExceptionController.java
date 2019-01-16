package com.cblue.base.exception;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

    @RequestMapping("/exception")
    public String exception() throws Exception {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            // throw new MyException();
            throw new Exception();
        }
        return null;
    }


}
