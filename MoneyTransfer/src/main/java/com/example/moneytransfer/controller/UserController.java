package com.example.moneytransfer.controller;



import com.example.moneytransfer.dto.AccountDTO;
import com.example.moneytransfer.dto.GroupAddDTO;
import com.example.moneytransfer.dto.User;
import com.example.moneytransfer.dto.UserListDTO;
import com.example.moneytransfer.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    //private final UserService userService;
    //그룹 생성

    @Autowired
    UserService userService;
    //그룹에 인원 추가

    @CrossOrigin(origins = "https://moneytransfer.kr")
    @GetMapping("/getUserInfo/{user_code}")
    public User getUserInfo(@PathVariable int user_code){
        return  userService.getUserInfo(user_code);
    }

    @CrossOrigin(origins = "https://moneytransfer.kr")
    @PostMapping("/signup")
    public void signUp(@RequestBody User user)
    {
        userService.signUp(user);
    }

    @CrossOrigin(origins = "https://moneytransfer.kr")
    @PostMapping("/login")
    public Integer login(@RequestBody Map<String, Object> request)
    {

        String id = (String)request.get("id");
        String password = (String)request.get("password");
        return userService.login(id,password);
    }

    @CrossOrigin(origins = "https://moneytransfer.kr")
    @GetMapping("/getUserList")
    public List<UserListDTO> getUserList(){

        return userService.getUserList();
    }

    @GetMapping("/getIdByCode/{user_code}")
    public String getIdByCode(@PathVariable int user_code)
    {
        return userService.getIdByCode(user_code);
    }

    @CrossOrigin(origins = "https://moneytransfer.kr")
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

}
