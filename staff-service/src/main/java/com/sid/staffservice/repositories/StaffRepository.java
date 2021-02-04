package com.sid.staffservice.repositories;

import com.sid.staffservice.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StaffRepository extends JpaRepository<Staff, Long> {

}
