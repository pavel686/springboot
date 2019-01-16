package com.cblue.springboot.demo12;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class Member implements Serializable {

    private Long mid ;
    private String name ;
    private Integer age ;
    private Double salary ;
    private Date birthday ;

    public Member() {
    }

    public Member(Long mid, String name) {
        this.mid = mid;
        this.name = name;
    }
}
