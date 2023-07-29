package com.projects.MapStruct.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class PersonDTO {
    private String id;
    private String firstName;
    private String lastName;
}
