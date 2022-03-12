package com.rybakov.springbootbackend.payload.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestPayload {
    private String text;

    private List<QuestionPayload> questionPayloadList;
}
