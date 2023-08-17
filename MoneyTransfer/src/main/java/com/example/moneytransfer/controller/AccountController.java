package com.example.moneytransfer.controller;


import com.example.moneytransfer.dto.AccountDTO;
import com.example.moneytransfer.dto.AccountPaymentDTO;
import com.example.moneytransfer.service.AccountService;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public List<AccountPaymentDTO> getTransferHistory(@PathVariable int account_code
    )
    {
        return accountService.getTransferHistory(account_code);
    }



    @GetMapping("/getNonCalculateMemberList/{group_code}")
    public List<AccountPaymentDTO> getNonCalculateMemberList(@PathVariable int group_code
    )
    {
        return accountService.getTransferHistory(group_code);
    }


}
