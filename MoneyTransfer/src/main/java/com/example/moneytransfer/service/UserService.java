package com.example.moneytransfer.service;
import com.example.moneytransfer.mapper.UserMapper;
import com.example.moneytransfer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User getUserInfo(int user_code) {
        return userMapper.getUserInfo(user_code);
    }

    public void signUp(User user){

        userMapper.signUp(user);
    }
}