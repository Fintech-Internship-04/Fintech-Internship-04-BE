package com.example.moneytransfer.mapper;


import com.example.moneytransfer.dto.AccountDTO;
import com.example.moneytransfer.dto.User;
import com.example.moneytransfer.dto.UserListDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    public User getUserInfo(@Param("user_code") int userCode);

    public void signUp(@Param("user") User user);

    public Integer login(@Param("id") String id,
                         @Param("password") String password);

    public List<UserListDTO> getUserList();

    public List<AccountDTO> getAccountList(@Param("user_code")
                                           int user_code);
}
