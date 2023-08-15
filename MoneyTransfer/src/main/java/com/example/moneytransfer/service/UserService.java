package com.example.moneytransfer.service;
import com.example.moneytransfer.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;


    public HashMap<String, Object> getUserInfo() {
        return userMapper.getUserInfo();

    }

}