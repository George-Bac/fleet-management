package com.project.fleetmanagement.repository;

import com.project.fleetmanagement.entity.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepository extends JpaRepository<VehicleType, Long> {
}
