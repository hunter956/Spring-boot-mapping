package com.spring.mapping.spring.boot.mapping.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String question;
    //@OneToOne(mappedBy = "question1")
    @JsonBackReference
    @OneToMany(mappedBy = "question",cascade = CascadeType.REMOVE)
    //@OneToMany(mappedBy = "question",orphanRemoval = true)  (used in many to many)
    List<Ans> ans;
   // Ans ans;

}

