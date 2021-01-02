package com.sid.studentservice.repository;

import com.sid.studentservice.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
