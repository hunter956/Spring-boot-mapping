package com.spring.mapping.spring.boot.mapping.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String question;
    @OneToOne(mappedBy = "question1")
    Ans ans;

}

