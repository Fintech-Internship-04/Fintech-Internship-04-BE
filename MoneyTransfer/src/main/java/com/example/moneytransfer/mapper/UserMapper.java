package com.example.moneytransfer.mapper;


import com.example.moneytransfer.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.*;

@Mapper
@Repository
public interface UserMapper {


    public HashMap<String,Object> getUserInfo();

}
