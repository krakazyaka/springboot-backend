package com.rybakov.springbootbackend.payload.test;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


public class TestPayload {
    public String getText() {
        return text;
    }

    public TestPayload(String text, List<QuestionPayload> questionPayloadList) {
        this.text = text;
        this.questionPayloadList = questionPayloadList;
    }

    public TestPayload() {
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<QuestionPayload> getQuestionPayloadList() {
        return questionPayloadList;
    }

    public void setQuestionPayloadList(List<QuestionPayload> questionPayloadList) {
        this.questionPayloadList = questionPayloadList;
    }

    private String text;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    private List<QuestionPayload> questionPayloadList;
}
