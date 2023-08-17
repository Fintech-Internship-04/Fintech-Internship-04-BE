package com.example.moneytransfer.service;

import com.example.moneytransfer.dto.*;
import com.example.moneytransfer.mapper.AccountMapper;
import com.example.moneytransfer.mapper.GroupMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountMapper accountMapper;


    public void deposit(AccountPaymentDTO payment_detail)
    {
        accountMapper.deposit(payment_detail);
        int balance = accountMapper.getBalance(String.valueOf(payment_detail.getAccount_num()));
        payment_detail.setBalance_amt(balance);
        accountMapper.createPaymentDetail(payment_detail);
    }



    public List<AccountDTO> getAccountList(int user_code)
    {
        return accountMapper.getAccountList(user_code);
    }
}