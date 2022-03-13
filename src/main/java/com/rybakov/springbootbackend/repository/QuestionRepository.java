package com.rybakov.springbootbackend.repository;

import com.rybakov.springbootbackend.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    Optional<Question> getById(int id);
}
