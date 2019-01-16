package com.cblue.base.jpa;

public interface UserService {

    // public void insertUser();


    /**
     * 增删改查
     */
    public void addUser(User user);

    public void updateUser(User user);

    public User findUserById(String id);

    public void deleteUserById(String id);


}
