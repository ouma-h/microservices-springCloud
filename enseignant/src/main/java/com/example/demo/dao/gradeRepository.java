package com.example.demo.dao;

import com.example.demo.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface gradeRepository extends JpaRepository<Grade, Long> {
}
