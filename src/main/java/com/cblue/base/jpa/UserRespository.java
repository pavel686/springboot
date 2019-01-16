package com.cblue.base.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//@Repository
public interface UserRespository extends JpaRepository<User, String> {

    public List<User> findByUsername(String username);

    @Query(value = "select * from user where username=?1", nativeQuery = true)
    List<User> findByUserName2(String username);
}
