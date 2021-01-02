package com.sid.studentservice.repository;

import com.sid.studentservice.entities.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ResultRepository extends JpaRepository<Result, Long> {
}
