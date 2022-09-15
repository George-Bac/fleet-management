package com.project.fleetmanagement.repository;

import com.project.fleetmanagement.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
