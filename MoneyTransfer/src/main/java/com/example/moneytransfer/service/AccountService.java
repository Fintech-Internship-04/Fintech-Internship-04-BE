package com.example.moneytransfer.service;

import com.example.moneytransfer.dto.Account;
import com.example.moneytransfer.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;

    public void deposit(Integer user_code){
        accountMapper.deposit()
    }

    public Map<List<Account>> getIntegrateAccount(Integer user_code){
        return AccountMapper.getIntegrateAccount(user_code);
    }
}
