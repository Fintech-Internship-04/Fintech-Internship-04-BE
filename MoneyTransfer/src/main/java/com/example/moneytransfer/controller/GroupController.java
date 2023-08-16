package com.example.moneytransfer.controller;


import com.example.moneytransfer.dto.GroupAddDTO;
import com.example.moneytransfer.dto.GroupCreateDTO;
import com.example.moneytransfer.model.Group;
import com.example.moneytransfer.model.User;
import com.example.moneytransfer.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/api/group")
public class GroupController {


    @Autowired
    GroupService groupService;


    @PostMapping("/createGroup")
    public void createGroup(@RequestBody Map<String,Object> request ){
        System.out.println(request);

        GroupCreateDTO groupRequest = new GroupCreateDTO();

        groupRequest.setUser_code((Integer)request.get("user_code"));
        groupRequest.setGroup_name((String)request.get("group_name"));

        List<GroupAddDTO> userList = (List<GroupAddDTO>)request.get("user_list");



        System.out.println(groupRequest);
        System.out.println(userList);


        groupService.createGroup(groupRequest);
        Integer group_code = groupRequest.getGroup_code();

        System.out.println(group_code);

        groupService.addMembers(group_code,userList);

    }



}
