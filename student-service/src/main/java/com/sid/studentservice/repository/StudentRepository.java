package com.sid.studentservice.repository;

import com.sid.studentservice.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
