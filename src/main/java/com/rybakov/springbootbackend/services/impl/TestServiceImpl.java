package com.rybakov.springbootbackend.services.impl;

import com.rybakov.springbootbackend.entity.Question;
import com.rybakov.springbootbackend.entity.Test;
import com.rybakov.springbootbackend.payload.test.QuestionPayload;
import com.rybakov.springbootbackend.payload.test.TestPayload;
import com.rybakov.springbootbackend.repository.TestRepository;
import com.rybakov.springbootbackend.services.TestService;

import org.springframework.stereotype.Service;

import javax.persistence.Access;
import java.util.ArrayList;
import java.util.List;


@Service
public class TestServiceImpl implements TestService {

    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    private final TestRepository testRepository;
    @Override
    public void saveTest(TestPayload testPayload) {
        Test testToSave = new Test();
        List<Question> questions= new ArrayList<>();
        testToSave.setName(testPayload.getText());
        for (QuestionPayload questionPayload : testPayload.getQuestionPayloadList()) {
            Question question = new Question();
            question.setTest(testToSave);
            question.setText(questionPayload.getText());
            questions.add(question);

        }
        testToSave.setQuestions(questions);
        testRepository.save(testToSave);
    }


    @Override
    public List<Test> getAllTests() {
        return testRepository.findAll();
    }

    @Override
    public Test getTestById(int id) {

        return testRepository.findById((long) id).get();
    }
}
