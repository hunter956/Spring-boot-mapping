package com.spring.mapping.spring.boot.mapping.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.engine.internal.Cascade;

@Entity
@Data
public class Ans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String answer;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_Ques_id")
    private Question question1;

}
