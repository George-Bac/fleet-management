package com.project.fleetmanagement.repository;

import com.project.fleetmanagement.entity.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Long> {
}
