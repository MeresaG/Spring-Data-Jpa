package edu.miu.SpringDataJpa.test;

import edu.miu.SpringDataJpa.entity.Course;
import edu.miu.SpringDataJpa.entity.Teacher;
import edu.miu.SpringDataJpa.repository.CourseRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepoTest {

    @Autowired
    private CourseRepo courseRepo;

    @Test
    public void getAllCourses() {
        System.out.println(courseRepo.findAll());
    }

    @Test
    public void saveCourseWithTeacher() {

        Teacher teacher = Teacher.builder()
                .lastName("Najeeb")
                .firstName("Najeeb")
                .build();

        Course course = Course.builder()
                .title("Python")
                .credit(5)
                .teacher(teacher)
                //.courseMaterial()
                .build();

        courseRepo.save(course);
    }

    @Test
    public void findAllPagination() {
        Pageable firstPageWithThreeRecords = PageRequest.of(0, 3, Sort.by("title"));
        Pageable secondPageWithTworecords =PageRequest.of(1, 2);
        System.out.println(courseRepo.findAll(firstPageWithThreeRecords).getContent());
        System.out.println(courseRepo.findAll(firstPageWithThreeRecords).getTotalElements());
        System.out.println(courseRepo.findAll(firstPageWithThreeRecords).getTotalPages());
    }

}