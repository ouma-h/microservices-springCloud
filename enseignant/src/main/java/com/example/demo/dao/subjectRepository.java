package com.example.demo.dao;

import com.example.demo.entity.subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface subjectRepository extends JpaRepository <subject, Long>{
}
