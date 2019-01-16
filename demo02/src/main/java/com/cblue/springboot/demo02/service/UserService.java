package com.cblue.springboot.demo02.service;

import com.cblue.springboot.demo02.pojo.User;

import java.util.List;

public interface UserService {

    void save();

    List<User> getUserList(int pageNum, int pageSize);
}
