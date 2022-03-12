package com.rybakov.springbootbackend.services;


import com.rybakov.springbootbackend.payload.test.TestPayload;

public interface TestService {
    void saveTest(TestPayload testPayload);
}
