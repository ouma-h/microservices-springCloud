package com.sid.studentservice.repository;

import com.sid.studentservice.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("SELECT c.succeded, COUNT(c.cin) FROM Student AS c GROUP BY c.succeded")
    List<Object[]> getstudentsbyresults();
}
