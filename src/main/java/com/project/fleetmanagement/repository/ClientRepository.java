package com.project.fleetmanagement.repository;

import com.project.fleetmanagement.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
