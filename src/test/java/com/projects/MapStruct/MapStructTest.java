package com.projects.MapStruct;

import com.projects.MapStruct.dto.BasicUserDTO;
import com.projects.MapStruct.dto.PersonDTO;
import com.projects.MapStruct.mapper.BasicMapper;
import com.projects.MapStruct.model.BasicUser;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MapStructTest {
    BasicUser user;
    @BeforeEach
    public void setUp(){
        user = BasicUser
                .builder()
                .id(1)
                .name("John Doe")
                .build();
    }

    @Test
    public void mapTest(){
        BasicUserDTO dto = BasicMapper.INSTANCE.convert(user);
        System.out.println(dto);
    }

    @Test
    public void mapPersonTest(){
        PersonDTO dto = BasicMapper.INSTANCE.convertCustom(user);
        System.out.println(dto);
    }
}
