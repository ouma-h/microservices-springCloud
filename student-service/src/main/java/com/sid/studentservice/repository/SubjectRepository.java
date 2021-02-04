package com.sid.studentservice.repository;

import com.sid.studentservice.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;

@RepositoryRestResource
public interface SubjectRepository extends JpaRepository<Subject, Long> {
    Set<Subject> findSubjectByGrade(String grade);
}
