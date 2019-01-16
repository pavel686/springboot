package com.cblue.springboot.demo04.exception;


import lombok.Data;

@Data
public class MyException extends RuntimeException {

    private String message;

    public MyException(String message){
        this.message = message;
    }


}
