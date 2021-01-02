package com.example.demo.dao;


import com.example.demo.entity.absence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface absenceRepository extends JpaRepository<absence, Long> {
}
