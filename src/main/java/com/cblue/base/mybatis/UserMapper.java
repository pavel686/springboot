package com.cblue.base.mybatis;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    void saveUser(User user) throws Exception;

    List<User> getList() throws Exception;

}
