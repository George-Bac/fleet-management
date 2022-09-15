package com.project.fleetmanagement.repository;

import com.project.fleetmanagement.entity.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance, Long> {
}
