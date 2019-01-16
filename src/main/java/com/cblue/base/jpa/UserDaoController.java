package com.cblue.base.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDaoController {

/*    @Autowired
    private UserRespository userRespository;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userRespository.findAll();
    }

    @RequestMapping("/findByUsername")
    public List<User> findByUsername(String username){
        System.out.println(username);
        return userRespository.findByUsername(username);
    }

    @RequestMapping("/findByUsername2")
    public List<User> findByUsername2(String username){
        System.out.println(username);
        return userRespository.findByUserName2(username);
    }*/


    /**
     * 增删改查
     */


    @Autowired
    private UserService userService;

    @RequestMapping("/insertUser")
    public void insertUser(User user) {
        userService.addUser(user);
    }

    @RequestMapping("/updateUser")
    public void updateUser(User user) {
        userService.updateUser(user);
    }


}
