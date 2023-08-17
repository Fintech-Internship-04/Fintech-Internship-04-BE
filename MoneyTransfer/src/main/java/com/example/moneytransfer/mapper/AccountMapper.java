package com.example.moneytransfer.mapper;


import com.example.moneytransfer.dto.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
@Repository
public interface AccountMapper {

    public void deposit(@Param("payment_detail") AccountPaymentDTO account);

    public List<AccountDTO> getAccountList(@Param("user_code") int user_code);

    public void createPaymentDetail(@Param("payment_detail") AccountPaymentDTO payment_detail);

    public int getBalance(@Param("account_num") String account_num);

}
