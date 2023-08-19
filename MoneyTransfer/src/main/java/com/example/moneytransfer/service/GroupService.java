package com.example.moneytransfer.service;
import com.example.moneytransfer.dto.Group;
import com.example.moneytransfer.dto.GroupAddDTO;
import com.example.moneytransfer.dto.GroupCreateDTO;
import com.example.moneytransfer.mapper.GroupMapper;
import org.apache.ibatis.annotations.Param;
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

    public List<Map<String,Object>> getGroupList(Integer user_code){


        List<Map<String,Object>> list = groupMapper.getGroupList(user_code);

        System.out.println(list);
        for(Map<String,Object> item : list)
        {
            int group_code = (int)item.get("group_code");
            List<Map<String,Object>> userList = groupMapper.getMemberListFromGroup(group_code);
            item.put("userList",userList);
        }

        return list;
    }




    public void leaveGroup(Integer user_code,
                            Integer group_code)
    {
        groupMapper.leaveGroup(user_code,group_code);
        if(groupMapper.getGroupHeadCount(group_code)==0)
        {
            groupMapper.deleteGroup(group_code);
        }

    }

    public void editGroupName(int group_code, String name){
        groupMapper.editGroupName(group_code, name);
    }


}