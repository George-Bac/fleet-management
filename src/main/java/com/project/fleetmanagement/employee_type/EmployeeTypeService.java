package com.project.fleetmanagement.employee_type;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeTypeService {

    private final EmployeeTypeRepository employeeTypeRepository;

    public List<EmployeeType> getEmployeeTypes() {
        return employeeTypeRepository.findAll();
    }

    public EmployeeType getEmployeeTypeById(Long employeeTypeId) {
        return employeeTypeRepository.findById(employeeTypeId).orElseThrow(() -> new RuntimeException(String.format("Employee type with id %s not found", employeeTypeId)));
    }

    public EmployeeType saveEmployeeType(EmployeeType employeeType) {
        return employeeTypeRepository.save(employeeType);
    }

    public void deleteEmployeeTypeById(Long employeeTypeId) {
        employeeTypeRepository.deleteById(employeeTypeId);
    }
}
