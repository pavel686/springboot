package com.cblue.springboot.demo02;

import com.cblue.springboot.demo02.pojo.User;
import com.cblue.springboot.demo02.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDao {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testAdd(){
        User user = new User();
        user.setUsername("mybatis1");
        user.setUserpass("mybatis2");
        try {
            userMapper.saveUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @Test
    public void testList(){
        List<User> users = null;
        try {
            users = userMapper.getList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(users.size());
    }


    @Test
    public void testMany(){
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUsername("mybatis"+i);
            user.setUserpass("mybatis"+i);
            try {
                userMapper.saveUser(user);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
