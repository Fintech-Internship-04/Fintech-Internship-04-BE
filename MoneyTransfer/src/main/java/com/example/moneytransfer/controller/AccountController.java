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
    public ResponseEntity<Void> deposit(@RequestBody AccountPaymentDTO payment_detail)
    {

        try{
            accountService.deposit(payment_detail);

        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping("/getAccountList/{user_code}")
    public List<AccountDTO> getAccountList(@PathVariable int user_code)
    {
        return accountService.getAccountList(user_code);
    }
    @GetMapping("/getTransferHistory/{user_code}")
    public List<AccountDTO> getTransferHistory(@PathVariable int user_code
    )
    {
        return accountService.getAccountList(user_code);
    }



}
