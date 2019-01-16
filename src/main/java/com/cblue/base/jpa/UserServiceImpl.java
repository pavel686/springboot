package com.cblue.base.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRespository userRespository;

 /*   @Override
    @Transactional
    public void insertUser() {
        User user1 = new User();
        user1.setUsername("test1");
        user1.setUserpass("test1");
        userRespository.save(user1);
        System.out.println("********");
        int i = 1/0;
        System.out.println("********");
        User user2 = new User();
        user2.setUsername("test2");
        user2.setUserpass("test2");
        userRespository.save(user2);

    }*/

    @Override
    public void addUser(User user) {
        userRespository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRespository.save(user);
    }

    @Override
    public User findUserById(String id) {
        return userRespository.getOne(id);
    }

    @Override
    public void deleteUserById(String id) {
        userRespository.deleteById(id);
    }
}
