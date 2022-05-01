package edu.miu.SpringDataJpa.test;

import edu.miu.SpringDataJpa.repository.CourseRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepoTest {

    @Autowired
    private CourseRepo courseRepo;

    @Test
    public void getAllCourses() {
        System.out.println(courseRepo.findAll());
    }

}