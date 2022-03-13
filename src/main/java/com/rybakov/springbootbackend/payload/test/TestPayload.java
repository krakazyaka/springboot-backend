package com.rybakov.springbootbackend.payload.test;



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

    private List<QuestionPayload> questionPayloadList;
}
