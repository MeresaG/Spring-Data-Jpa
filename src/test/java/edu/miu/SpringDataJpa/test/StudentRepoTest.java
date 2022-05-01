package edu.miu.SpringDataJpa.test;

import edu.miu.SpringDataJpa.entity.Student;
import edu.miu.SpringDataJpa.repository.StudentRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class StudentRepoTest {

    @Autowired
    private StudentRepo studentRepo;

    @Test
    public void saveStudent() {
        Student student = Student.builder().firstName("Meresa")
                .lastName("Gebrewahd").email("meresa27@gmail.com")
                .age(29).guardianEmail("yemane@miu.edu")
                .guardianName("yemane")
                .guardianMobile("+251914854819").build();
        studentRepo.save(student);
    }

    @Test
    public void printAllStudent() {
        System.out.println(studentRepo.findAll());
    }

}