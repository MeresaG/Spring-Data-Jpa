package edu.miu.SpringDataJpa.repository;

import edu.miu.SpringDataJpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    public List<Student> findByFirstName(String firstName);

    @Query("select s from Student s where s.email =?1")
    public Student getStudentByEmail(String email);

    @Query("select s.firstName from Student  s where s.email =?1")
    public String getStudentFirstNameByEmail(String email);
    public List<Student> findByGuardianNameContaining(String name);
}
