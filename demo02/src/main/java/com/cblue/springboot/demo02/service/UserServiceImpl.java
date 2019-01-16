package com.cblue.springboot.demo02.service;

import com.cblue.springboot.demo02.mapper.UserMapper;
import com.cblue.springboot.demo02.pojo.User;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public void save()  {


            User u1 = new User();
            u1.setUsername("hehe");
            userMapper.saveUser(u1);

            int i = 1/0;

            User u2 = new User();
            u2.setUsername("haha");
            userMapper.saveUser(u2);



    }


    public List<User> getUserList(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.getList();
    }


}
