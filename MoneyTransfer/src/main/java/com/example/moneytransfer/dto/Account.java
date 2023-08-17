package com.example.moneytransfer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private int account_id;
    // 계좌 고유PK
    private int balance_amt;
    // 계좌의 잔액
    private String account_num;
    // 계좌 번호 (12자리)
}
