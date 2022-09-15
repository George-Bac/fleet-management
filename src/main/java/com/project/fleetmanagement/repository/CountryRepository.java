package com.project.fleetmanagement.repository;

import com.project.fleetmanagement.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
