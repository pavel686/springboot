package com.cblue.springboot.demo02.pojo;


public class User {

    private String id;

    private String username;

    private String userpass;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public User() {
    }

    public User(String id, String username, String userpass) {
        this.id = id;
        this.username = username;
        this.userpass = userpass;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                '}';
    }
}
