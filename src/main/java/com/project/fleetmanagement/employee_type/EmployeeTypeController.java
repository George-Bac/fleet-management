package com.project.fleetmanagement.employee_type;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee-types")
@RequiredArgsConstructor
public class EmployeeTypeController {

    private final EmployeeTypeService employeeTypeService;
}
