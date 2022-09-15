package com.project.fleetmanagement.repository;

import com.project.fleetmanagement.entity.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Long> {
}
