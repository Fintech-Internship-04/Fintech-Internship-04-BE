package com.example.moneytransfer.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "number", nullable = false)
    private Long number;

    @Column(unique = true)
    private String Id;

    private String password;

    @Column(unique = true)
    private String name;
}
