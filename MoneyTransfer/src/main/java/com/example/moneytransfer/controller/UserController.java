package com.example.moneytransfer.controller;



import com.example.moneytransfer.model.User;
import com.example.moneytransfer.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    //private final UserService userService;
    //그룹 생성

    @Autowired
    UserService userService;
    //그룹에 인원 추가
    @GetMapping("/getUserInfo/{user_code}")
    public User getUserInfo(@PathVariable int user_code){
        return  userService.getUserInfo(user_code);
    }

}
