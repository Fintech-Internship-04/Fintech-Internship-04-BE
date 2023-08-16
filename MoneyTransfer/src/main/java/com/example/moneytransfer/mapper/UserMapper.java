package com.example.moneytransfer.mapper;


import com.example.moneytransfer.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    public User getUserInfo(@Param("user_code") int userCode);

    public void signUp(@Param("user") User user);
}
