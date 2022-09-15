package com.project.fleetmanagement.repository;

import com.project.fleetmanagement.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
