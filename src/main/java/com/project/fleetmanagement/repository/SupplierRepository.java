package com.project.fleetmanagement.repository;

import com.project.fleetmanagement.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
