package com.project.fleetmanagement.repository;

import com.project.fleetmanagement.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
