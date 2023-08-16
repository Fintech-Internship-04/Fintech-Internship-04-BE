package com.example.moneytransfer.mapper;


import com.example.moneytransfer.dto.Group;
import com.example.moneytransfer.dto.GroupAddDTO;
import com.example.moneytransfer.dto.GroupCreateDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.*;
@Mapper
@Repository
public interface GroupMapper {



    //모임 생성하기
    public void createGroup(@Param("group_request") GroupCreateDTO groupRequest);

    //모임에 멤버 추가하기
    public void addMembers(@Param("group_code") Integer group_code,
            @Param("user_list") List<GroupAddDTO> userList);

    //모임에서 멤버 삭제하기
    public void deleteMembers(@Param("delete_list") List<Integer> deleteUserList);


    public List<Group> getGroupList(@Param("user_code") Integer user_code);

    public void leaveGroup(@Param("user_code") Integer user_code,
                           @Param("group_code") Integer group_code);
    //모임 이름 수정
    public void editGroupName(@Param("group_name") String name);

    public int getGroupCode(@Param("group_name") String name);


}
