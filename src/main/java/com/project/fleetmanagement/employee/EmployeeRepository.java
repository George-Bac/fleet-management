package com.project.fleetmanagement.employee;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("select e from Employee e where e.firstName like '%?1%' or e.lastName like '%?1%'")
    List<Employee> findByKeyword(String keyword);
}
