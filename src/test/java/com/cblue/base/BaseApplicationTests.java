package com.cblue.base;

import com.cblue.base.jpa.UserService;
import com.cblue.base.jpa.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private UserService userService;

    @Test
    public void add() {
        User user = new User();
        user.setUsername("hehe");
        user.setUserpass("789");
        userService.addUser(user);
    }

    @Test
    public void update() {
        User user = new User();
        //user.setId(2);
        user.setUserpass("xiaohei");
        user.setUserpass("555");
        userService.updateUser(user);
    }

}
