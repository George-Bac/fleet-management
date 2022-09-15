package com.project.fleetmanagement.repository;

import com.project.fleetmanagement.entity.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Long> {
}
