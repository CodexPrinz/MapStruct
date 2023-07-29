package com.projects.MapStruct.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class BasicUser {
    private int id;
    private String name;
}
