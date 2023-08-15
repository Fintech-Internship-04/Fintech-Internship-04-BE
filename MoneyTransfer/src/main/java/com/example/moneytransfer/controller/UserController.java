package com.example.moneytransfer.controller;


import com.example.moneytransfer.model.User;
import com.example.moneytransfer.mapper.UserMapper;
import com.example.moneytransfer.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    //private final UserService userService;
    //그룹 생성

    @Autowired
    UserService userService;
    //그룹에 인원 추가
    @GetMapping("/getUserInfo")
    public HashMap<String, Object> getUserInfo(){
        return  userService.getUserInfo();
    }

}
