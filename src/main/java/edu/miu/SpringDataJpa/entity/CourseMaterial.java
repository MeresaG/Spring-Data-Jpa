package edu.miu.SpringDataJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseMaterial {

    @Id
    @GeneratedValue
    private long id;
    private String url;

    @OneToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
