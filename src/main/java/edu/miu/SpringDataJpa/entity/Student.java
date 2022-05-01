package edu.miu.SpringDataJpa.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "first_name", columnDefinition ="TEXT", nullable = false)
    private String firstName;
    @Column(name = "last_name", columnDefinition ="TEXT", nullable = false)
    private String lastName;
    @Column(name = "email",columnDefinition ="TEXT", nullable = false, unique = true)
    private String email;
    @Column(name = "age", nullable = false, columnDefinition ="TEXT")
    private int age;
}
