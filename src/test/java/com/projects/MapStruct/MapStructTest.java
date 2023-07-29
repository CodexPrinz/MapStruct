package com.projects.MapStruct;

import com.projects.MapStruct.dto.BasicUserDTO;
import com.projects.MapStruct.mapper.BasicMapper;
import com.projects.MapStruct.model.BasicUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MapStructTest {

    @Test
    public void mapTest(){
        BasicUser user = BasicUser
                .builder()
                .id(1)
                .name("John Doe")
                .build();

        BasicUserDTO dto = BasicMapper.INSTANCE.convert(user);
        System.out.println(dto);
    }
}
