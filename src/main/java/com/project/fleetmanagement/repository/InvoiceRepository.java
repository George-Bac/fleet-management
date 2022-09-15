package com.project.fleetmanagement.repository;

import com.project.fleetmanagement.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
