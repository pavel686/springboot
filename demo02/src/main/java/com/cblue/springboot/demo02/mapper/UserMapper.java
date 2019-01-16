package com.cblue.springboot.demo02.mapper;


import com.cblue.springboot.demo02.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    void saveUser(User user);

    List<User> getList();

}
