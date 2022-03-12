package com.rybakov.springbootbackend.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Question extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Test test;

    private String text;

}
