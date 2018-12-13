package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MapperController {

    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/queryUser")

    public List<User> queryUser(){
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
