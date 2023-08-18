package com.example.moneytransfer.service;
import com.example.moneytransfer.dto.AccountDTO;
import com.example.moneytransfer.dto.UserListDTO;
import com.example.moneytransfer.mapper.UserMapper;
import com.example.moneytransfer.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Integer login(String id, String password){
        return userMapper.login(id,password);
    }

    public List<UserListDTO> getUserList(){

        return userMapper.getUserList();
    }

    public String getIdByCode(int user_code){
        return userMapper.getIdByCode(user_code);
    }

}