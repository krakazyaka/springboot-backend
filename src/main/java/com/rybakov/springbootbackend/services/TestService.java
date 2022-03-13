package com.rybakov.springbootbackend.services;


import com.rybakov.springbootbackend.entity.Test;
import com.rybakov.springbootbackend.payload.test.TestPayload;

import java.util.List;

public interface TestService {
    void saveTest(TestPayload testPayload);
    List<Test> getAllTests();
    Test getTestById(int id);
}
