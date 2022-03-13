package com.rybakov.springbootbackend.mapper;

import com.rybakov.springbootbackend.DTO.TestDto;
import com.rybakov.springbootbackend.DTO.TestFullDto;
import com.rybakov.springbootbackend.DTO.TestNameDto;
import com.rybakov.springbootbackend.entity.Test;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TestMapper {

    @Mapping(source = "name",target = "name")
    TestNameDto testNameDto(Test test);

    List<TestNameDto> listTestNameDto(List<Test> tests);

    @Mapping(source = "name",target = "name")
    TestFullDto testFullDto(Test test);

    List<TestFullDto> listTestFullDto(List<Test> tests);

}
