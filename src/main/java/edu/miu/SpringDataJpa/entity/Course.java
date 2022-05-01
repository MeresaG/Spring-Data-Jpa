package edu.miu.SpringDataJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Integer credit;

    //Bidirectional one to one mapping
    @OneToOne(mappedBy = "course")
    private CourseMaterial courseMaterial;

}
