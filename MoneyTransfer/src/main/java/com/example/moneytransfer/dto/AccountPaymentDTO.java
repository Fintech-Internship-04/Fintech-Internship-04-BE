package com.example.moneytransfer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountPaymentDTO {


    private int bank_tran_id;

    private int balance_amt;

    private boolean is_taken;

    private String payment_dest;

    private int account_code;

    private int user_code;

    private int group_code;

}
