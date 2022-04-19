package com.rybakov.springbootbackend.services.impl;

import com.rybakov.springbootbackend.entity.Question;
import com.rybakov.springbootbackend.repository.QuestionRepository;
import com.rybakov.springbootbackend.services.Questionervice;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;


@Service
public class QuestionServiceImpl implements Questionervice {
    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    private final QuestionRepository questionRepository;
    @Override
    public void increaseVote(long id) {
        Question q = questionRepository.getById(id);
        q.setCountVotes(q.getCountVotes()+1);
        questionRepository.save(q);
    }
}
