package com.rybakov.springbootbackend.entity;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Test extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Test() {
    }

    public Test(String name, String description, List<Question> questions) {
        this.name = name;
        this.description = description;
        this.questions = questions;
    }

    private String description;

    @OneToMany(mappedBy = "test",
                cascade = CascadeType.ALL)
    private List<Question> questions;


}
