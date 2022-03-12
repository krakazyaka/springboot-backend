package com.rybakov.springbootbackend.controller;

import com.rybakov.springbootbackend.payload.test.QuestionPayload;
import com.rybakov.springbootbackend.payload.test.TestPayload;
import com.rybakov.springbootbackend.repository.TestRepository;
import com.rybakov.springbootbackend.services.TestService;
import com.rybakov.springbootbackend.services.impl.TestServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payload")
public class PayLoadController {

    @Autowired
    TestServicesImpl testServices;
    @PostMapping("/test")
    public String receiveTestPayload(@RequestBody TestPayload testPayload){

        System.out.println(testPayload.getText());
        System.out.println(testPayload.getQuestionPayloadList().size());

        for (QuestionPayload questionPayload : testPayload.getQuestionPayloadList()) {
            System.out.println(questionPayload.getText());
        }
        testServices.saveTest(testPayload);
        return "123";
    }
}
