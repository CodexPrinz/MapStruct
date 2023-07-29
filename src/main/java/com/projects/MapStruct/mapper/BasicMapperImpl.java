package com.projects.MapStruct.mapper;

import com.projects.MapStruct.dto.BasicUserDTO;
import com.projects.MapStruct.model.BasicUser;

public class BasicMapperImpl implements BasicMapper{
    @Override
    public BasicUserDTO convert(BasicUser user) {

        if (user == null)
            return null;

        BasicUserDTO dto = BasicUserDTO.builder()
                .id(user.getId())
                .name(user.getName())
                .build();

        return dto;
    }
}
