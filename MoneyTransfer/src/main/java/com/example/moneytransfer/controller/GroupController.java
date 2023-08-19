package com.example.moneytransfer.controller;


import com.example.moneytransfer.dto.Group;
import com.example.moneytransfer.dto.GroupAddDTO;
import com.example.moneytransfer.dto.GroupCreateDTO;
import com.example.moneytransfer.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@CrossOrigin
@RequestMapping("/api/group")
public class GroupController {


    @Autowired
    GroupService groupService;


    @PostMapping("/createGroup")
    public boolean createGroup(@RequestBody Map<String, Object> request) {

       try{
           System.out.println(request);

           GroupCreateDTO groupRequest = new GroupCreateDTO();

           groupRequest.setUser_code((Integer) request.get("user_code"));
           groupRequest.setGroup_name((String) request.get("group_name"));
           groupRequest.setHeadcount((Integer) request.get("headcount"));


           List<GroupAddDTO> userList = (List<GroupAddDTO>) request.get("user_list");


           System.out.println(groupRequest);
           System.out.println(userList);


           groupService.createGroup(groupRequest);
           Integer group_code = groupRequest.getGroup_code();

           System.out.println(group_code);

           groupService.addMembers(group_code, userList);
       }catch(Exception e)
       {
           e.printStackTrace();
           return false;
       }

        return true;
    }


    @PostMapping("/addMembers")
    public boolean addMembers(@RequestBody Map<String, Object> request) {

        try{
            System.out.println(request);

            Integer group_code = (Integer)request.get("group_code");


            List<GroupAddDTO> userList = (List<GroupAddDTO>) request.get("user_list");

            groupService.addMembers(group_code, userList);
        }catch(Exception e)
        {
            return false;
        }

        return true;
    }


    @GetMapping("/getGroupList/{user_code}")
    public List<Map<String,Object>> getGroupList(@PathVariable Integer user_code) {

        return groupService.getGroupList(user_code);
    }

    @PostMapping("/leaveGroup")
    public boolean leaveGroup(@RequestParam Integer user_code,
                           @RequestParam Integer group_code)
    {
        try{
            groupService.leaveGroup(user_code,group_code);
        }catch(Exception e){
            return false;
        }

        return true;

    }

    @PostMapping("editGroupName/{group_code}/{group_name}")
    public void editGroupName(@PathVariable int group_code,
                              @PathVariable String group_name){

        groupService.editGroupName(group_code,group_name);
    }

}
