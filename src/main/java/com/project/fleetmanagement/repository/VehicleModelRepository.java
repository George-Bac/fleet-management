package com.project.fleetmanagement.repository;

import com.project.fleetmanagement.entity.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleModelRepository extends JpaRepository<VehicleModel, Long> {
}
