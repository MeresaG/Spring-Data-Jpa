package edu.miu.SpringDataJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id")
    private List<Course> courses;
}
