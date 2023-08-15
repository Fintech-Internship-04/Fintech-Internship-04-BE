package com.example.moneytransfer.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int user_code;


    private String Id;

    private String password;


    private String phone_num;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;


}
