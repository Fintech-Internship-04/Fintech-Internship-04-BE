package com.example.moneytransfer.user;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import java.util.*;
@RestController
@RequestMapping("/group")
public class UserController {


    //그룹 생성

    //그룹에 인원 추가
    @PostMapping("/addMember")
    public boolean addMember(@RequestBody List<User> userList){


        //인원 추가 성공시
        if(1==1)
        {
            return true;
        }
        //인원 추가 실패시
        else{
            return false;
        }
    }

}
