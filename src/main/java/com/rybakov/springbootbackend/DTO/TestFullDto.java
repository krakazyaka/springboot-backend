package com.rybakov.springbootbackend.DTO;


public class TestFullDto {
    private String name;

    public TestFullDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public TestFullDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;
}
