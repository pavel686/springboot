package com.cblue.base.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMybatis {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testAdd() {
        User user = new User();
        user.setUsername("mybatisa");
        user.setUserpass("mybatisb");
        try {
            userMapper.saveUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testList() {
        List<User> users = null;
        try {
            users = userMapper.getList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(users.size());
    }
}
