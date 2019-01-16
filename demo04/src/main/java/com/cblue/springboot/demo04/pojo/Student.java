package com.cblue.springboot.demo04.pojo;

import lombok.Data;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue
    private Integer id;
    @NotEmpty(message="用户名不能为空")
    private String name;
    @Length(min=6, message="密码长度不能少于6位")
    private String password;
    @NotNull(message = "生日不能为空")
    private Date birthday;

}
