// StudentRepository.java
package com.project.StudentsTeamsProject.repository;

import com.project.StudentsTeamsProject.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Optional<Student> findByEmailAndParola(String email, String parola);
    @Query("SELECT s FROM Student s LEFT JOIN FETCH s.idEchipa WHERE s.idEchipa IS NOT NULL")
    List<Student> findAllWithTeam();
}
