package com.rybakov.springbootbackend.entity;



import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
public class Question extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "question_id")
    @JsonIgnore
    private Test test;

    private String text;

    public Question() {
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCountVotes() {
        return countVotes;
    }

    public void setCountVotes(int countVotes) {
        this.countVotes = countVotes;
    }

    public Question(Test test, String text, int countVotes) {
        this.test = test;
        this.text = text;
        this.countVotes = countVotes;
    }

    private int countVotes;

}
