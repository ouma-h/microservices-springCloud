package com.sid.studentservice.repository;

import com.sid.studentservice.entities.Absence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AbsenceRepository extends JpaRepository<Absence, Long> {
}
