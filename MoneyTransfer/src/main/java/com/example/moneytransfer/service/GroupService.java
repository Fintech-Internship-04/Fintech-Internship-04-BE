package com.example.moneytransfer.service;
import com.example.moneytransfer.dto.Group;
import com.example.moneytransfer.dto.GroupAddDTO;
import com.example.moneytransfer.dto.GroupCreateDTO;
import com.example.moneytransfer.mapper.GroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class GroupService {

    @Autowired
    GroupMapper groupMapper;
    public void createGroup(GroupCreateDTO groupRequest){

        groupMapper.createGroup(groupRequest);
    }

    public void addMembers(Integer group_code,List<GroupAddDTO> userList){


        groupMapper.addMembers(group_code, userList);
    }

    public List<Group> getGroupList(Integer user_code){
        return groupMapper.getGroupList(user_code);
    }


}