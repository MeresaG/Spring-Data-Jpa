package edu.miu.SpringDataJpa.test;

import edu.miu.SpringDataJpa.entity.Guardian;
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
                .age(29)

                .build();
        studentRepo.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {

        Guardian guardian = Guardian.builder()
                .email("aregawi@miu.edu")
                .name("aregawi")
                .mobile("+251914854819")
                .build();

        Student student = Student.builder().firstName("heran")
                .lastName("aregawi")
                .email("heru@gmail.com")
                .age(25)
                .guardian(guardian)
                .build();
        studentRepo.save(student);
    }

    @Test
    public void findByFirstName() {
        System.out.println(studentRepo.findByFirstName("heran"));
    }

    @Test
    public void findByGuardianName() {
        System.out.println(studentRepo.findByGuardianNameContaining("man"));
    }

    @Test
    public void findByEmail() {
        System.out.println(studentRepo.getStudentByEmail("heru@gmail.com"));
    }

    @Test
    public void findFirstNameByEmail() {
        System.out.println(studentRepo.getStudentFirstNameByEmail("heru@gmail.com"));
    }
    @Test
    public void printAllStudent() {
        System.out.println(studentRepo.findAll());
    }

}