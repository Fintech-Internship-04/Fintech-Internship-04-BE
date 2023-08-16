package com.example.moneytransfer.service;
import com.example.moneytransfer.mapper.UserMapper;
import com.example.moneytransfer.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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