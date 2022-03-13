package com.rybakov.springbootbackend.controller;

import com.rybakov.springbootbackend.DTO.TestFullDto;
import com.rybakov.springbootbackend.DTO.TestNameDto;
import com.rybakov.springbootbackend.entity.Test;
import com.rybakov.springbootbackend.mapper.TestMapper;

import com.rybakov.springbootbackend.payload.test.QuestionPayload;
import com.rybakov.springbootbackend.payload.test.TestPayload;
import com.rybakov.springbootbackend.services.Questionervice;
import com.rybakov.springbootbackend.services.TestService;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/payload")
public class PayLoadController {
    public PayLoadController(TestService testServices, Questionervice questionervice, TestMapper testMapper) {
        this.testServices = testServices;
        this.questionervice = questionervice;
        this.testMapper = testMapper;
    }

    private final TestService testServices;
    private final Questionervice questionervice;
    private final TestMapper testMapper;

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

    @GetMapping("/testInfo")
    public Test getTestInf(@RequestParam Integer id){
        return testServices.getTestById(id);
    }

    @GetMapping("/testNames")
    public List<TestNameDto> getAllTests2(){

        return testMapper.listTestNameDto(testServices.getAllTests());
    }

    @GetMapping("/allTests")
    public List<Test> getAllTests(){
        return testServices.getAllTests();
    }

    @GetMapping("/testNamesDescr")
    public List<TestFullDto> getAllDto(){
        return testMapper.listTestFullDto(testServices.getAllTests());
    }

    @PostMapping("/answer")
    public void IncreaseVote(@RequestParam int id){

        questionervice.increaseVote(id);

    }


}
