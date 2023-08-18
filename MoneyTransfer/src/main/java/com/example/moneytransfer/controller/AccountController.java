package com.example.moneytransfer.controller;


import com.example.moneytransfer.dto.AccountDTO;
import com.example.moneytransfer.dto.AccountPaymentDTO;
import com.example.moneytransfer.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    AccountService accountService;


    @PostMapping("/deposit")
    public boolean deposit(@RequestBody AccountPaymentDTO payment_detail)
    {
        try{
            return accountService.deposit(payment_detail);
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }


    @GetMapping("/getAccountList/{user_code}")
    public List<AccountDTO> getAccountList(@PathVariable Integer user_code)
    {
        return accountService.getAccountList(user_code);
    }
    @GetMapping("/getTransferHistory/{account_code}")
    public List<AccountDTO> getTransferHistory(@PathVariable int account_code
    )
    {
        List<AccountDTO> list = accountService.getTransferHistory(account_code);
        String account_num = accountService.getAccountNum(account_code);
        System.out.println(account_num);

        for(AccountDTO item:list)
        {
            item.setAccount_num(account_num);
        }
        System.out.println("hello");
       return list;
    }

    @GetMapping("/getAccountNum/{account_code}")
    public String getAccountNum(@PathVariable int account_code)
    {
        return accountService.getAccountNum(account_code);
    }

    @GetMapping("/getNonCalculateMemberList/{group_code}")
    public List<Map<String,Object>> getNonCalculateMemberList(@PathVariable int group_code
    )
    {
        return accountService.getNonCalculateMemberList(group_code);
    }

    @GetMapping("/getBalance/{account_code}")
    public int getBalance(@PathVariable int account_code)
    {
        return accountService.getBalance(account_code);
    }


}
