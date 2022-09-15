package com.project.fleetmanagement.repository;

import com.project.fleetmanagement.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
