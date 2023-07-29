package com.projects.MapStruct.mapper;

import com.projects.MapStruct.dto.BasicUserDTO;
import com.projects.MapStruct.model.BasicUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BasicMapper {
    BasicMapper INSTANCE = Mappers.getMapper(BasicMapper.class);
    BasicUserDTO convert(BasicUser user);
}
