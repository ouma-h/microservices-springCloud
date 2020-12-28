package com.example.demo.dao;

import com.example.demo.entity.enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface enseignantRepository extends JpaRepository <enseignant , Long> {


}
