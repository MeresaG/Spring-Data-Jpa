package edu.miu.SpringDataJpa.test;

import edu.miu.SpringDataJpa.entity.Course;
import edu.miu.SpringDataJpa.entity.Teacher;
import edu.miu.SpringDataJpa.repository.TeacherRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepoTest {

    @Autowired
    private TeacherRepo teacherRepo;

    @Test
    public void saveTeacher() {

        Course courseDBA = Course.builder()
                .title("DBA")
                .credit(5)
                .build();
        Course courseJava = Course.builder()
                .title("JAVA")
                .credit(4)
                .build();

        Teacher teacher = Teacher.builder()
                .firstName("Umar")
                .lastName("Inan")
                .build();
        teacherRepo.save(teacher);
    }


}