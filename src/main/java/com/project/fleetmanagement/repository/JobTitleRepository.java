package com.project.fleetmanagement.repository;

import com.project.fleetmanagement.entity.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleRepository extends JpaRepository<JobTitle, Long> {
}
