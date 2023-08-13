package com.example.moneytransfer.group;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Entity
public class Group{
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "group_id", nullable = false)
    private Long group_id;

    private String name;

}

