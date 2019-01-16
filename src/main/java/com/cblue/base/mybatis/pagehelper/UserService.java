package com.cblue.base.mybatis.pagehelper;

import com.cblue.base.mybatis.User;
import com.cblue.base.mybatis.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.github.pagehelper.PageHelper;

@Service
@Transactional(rollbackFor = {RuntimeException.class, Exception.class})
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUserList(int pageNum, int pageSize) throws Exception {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.getList();
    }

}
