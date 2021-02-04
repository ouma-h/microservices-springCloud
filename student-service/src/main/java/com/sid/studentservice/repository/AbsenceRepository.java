package com.sid.studentservice.repository;

import com.sid.studentservice.entities.Absence;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource
public interface AbsenceRepository extends JpaRepository<Absence, Long>{
    @Query("SELECT c.date FROM Absence AS c")
    List<Object[]> countTotalAbsencePerDate();
}
