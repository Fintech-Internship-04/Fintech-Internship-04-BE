package com.example.moneytransfer.mapper;


import com.example.moneytransfer.dto.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface AccountMapper {

    public void deposit(@Param("payment_detail") AccountPaymentDTO payment_detail);

    public List<AccountDTO> getAccountList(@Param("user_code") int user_code);

    public List<AccountDTO> getTransferHistory(@Param("account_code") int account_code);
    public void createPaymentDetail(@Param("payment_detail") AccountPaymentDTO payment_detail);

    public int getBalance(@Param("account_code") int account_code);

    public String getUserId(@Param("user_code") int user_code);

    public List<Map<String,Object>> getNonCalculateMemberList(@Param("group_code") int group_code);

    public String getAccountNum(@Param("account_code") int account_code);
}
