package com.spring.mapping.spring.boot.mapping.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

@Entity
@Data
public class Ans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String answer;
  //  @OneToOne(cascade = CascadeType.ALL)
  //@OneToOne(cascade = CascadeType.REMOVE)
    @ManyToOne
    private Question question;

}
