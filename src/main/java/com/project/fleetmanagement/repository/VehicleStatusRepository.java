package com.project.fleetmanagement.repository;

import com.project.fleetmanagement.entity.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Long> {
}
