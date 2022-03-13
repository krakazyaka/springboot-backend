package com.rybakov.springbootbackend.config;

import com.rybakov.springbootbackend.mapper.TestMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public TestMapper getTestMapper(){
        return Mappers.getMapper(TestMapper.class);
    }
}
