package com.rybakov.springbootbackend.payload.test;



public class QuestionPayload {

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;

    public QuestionPayload(String text) {
        this.text = text;
    }

    public QuestionPayload() {
    }
}
