package com.rybakov.springbootbackend.DTO;



public class TestDto {
    private String name;

    public TestDto() {
    }

    public TestDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
