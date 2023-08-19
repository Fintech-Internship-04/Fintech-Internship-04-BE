package com.example.moneytransfer.controller;



import com.example.moneytransfer.dto.AccountDTO;
import com.example.moneytransfer.dto.GroupAddDTO;
import com.example.moneytransfer.dto.User;
import com.example.moneytransfer.dto.UserListDTO;
import com.example.moneytransfer.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@CrossOrigin
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


    @PostMapping("/signup")
    public void signUp(@RequestBody User user)
    {
        userService.signUp(user);
    }


    @PostMapping("/login")
    public ResponseEntity<Integer> login(@RequestBody Map<String, Object> request)
    {

        String id = (String)request.get("id");
        String password = (String)request.get("password");
        if(userService.login(id,password)==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Integer>(userService.login(id,password),HttpStatus.OK);
    }


    @GetMapping("/getUserList")
    public List<Map<String,Object>> getUserList(){

        return userService.getUserList();
    }

    @GetMapping("/getUserList2")
    public List<Map<String,Object>> getUserList2(){

        return userService.getUserList2();
    }

    @GetMapping("/getIdByCode/{user_code}")
    public String getIdByCode(@PathVariable int user_code)
    {
        return userService.getIdByCode(user_code);
    }


    @PostMapping("/editUserInfo")
    public boolean editUserInfo(@RequestBody User user)
    {
        try{
            userService.editUserInfo(user);
            return true;
        }catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }

    }

    @GetMapping("/getUserByName/{keyword}")
    public List<Map<String,Object>> getUserByName(@PathVariable String keyword){
        return userService.getUserByName(keyword);
    }

}
