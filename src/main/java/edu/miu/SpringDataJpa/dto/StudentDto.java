package edu.miu.SpringDataJpa.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor
public class StudentDto {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
