package edu.miu.SpringDataJpa.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor
@Builder
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

    @Embedded
    private Guardian guardian;


}
