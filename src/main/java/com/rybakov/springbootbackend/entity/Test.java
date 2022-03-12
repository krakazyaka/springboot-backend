package com.rybakov.springbootbackend.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Test extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "test",
                cascade = CascadeType.ALL)
    private List<Question> questions;


}
