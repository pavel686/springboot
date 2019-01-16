package com.cblue.springboot.demo02;

import com.cblue.springboot.demo02.pojo.User;
import com.cblue.springboot.demo02.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableTransactionManagement
public class TestService {

    @Autowired
    private UserService userService;

    @Test
    public void testAdd(){
       userService.save();
    }


    @Test
    public void testPage(){
       List<User> users =  userService.getUserList(1,5);
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }

    }


}
