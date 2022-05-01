package edu.miu.SpringDataJpa.test;

import edu.miu.SpringDataJpa.entity.Course;
import edu.miu.SpringDataJpa.entity.CourseMaterial;
import edu.miu.SpringDataJpa.repository.CourseMaterialRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepoTest {

    @Autowired
    private CourseMaterialRepo courseMaterialRepo;

    @Test
    public void saveCourseMaterial() {
        Course course = Course.builder()
                .title("DataStructure and Algorithm")
                .credit(6)
                .build();
        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.google.com")
                .course(course)
                .build();

        courseMaterialRepo.save(courseMaterial);
    }

    @Test
    public void printAllCourseMaterials() {
        System.out.println(courseMaterialRepo.findAll());
    }
}