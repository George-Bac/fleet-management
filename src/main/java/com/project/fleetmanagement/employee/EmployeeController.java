package com.project.fleetmanagement.employee;

import com.project.fleetmanagement.country.CountryService;
import com.project.fleetmanagement.employee_type.EmployeeTypeService;
import com.project.fleetmanagement.job_title.JobTitleService;
import com.project.fleetmanagement.state.StateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;
    private final EmployeeTypeService employeeTypeService;
    private final JobTitleService jobTitleService;
    private final StateService stateService;
    private final CountryService countryService;

    @GetMapping
    public String getEmployees(Model model) {
        model.addAttribute("employees", employeeService.getEmployees());
        model.addAttribute("employeeTypes", employeeTypeService.getEmployeeTypes());
        model.addAttribute("jobTitles", jobTitleService.getJobTitles());
        model.addAttribute("states", stateService.getStates());
        model.addAttribute("countries", countryService.getCountries());
        return "entity/employee";
    }

    @RequestMapping("/{employeeId}")
    @ResponseBody
    public Employee getEmployeeById(@PathVariable Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping("/save-employee")
    public String saveCountryForm(@ModelAttribute Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }

    @RequestMapping(value = "/update-employee", method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateCountryForm(@ModelAttribute Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }

    @RequestMapping(value = "/delete-employee/{employeeId}", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String confirmDeleteModal(@PathVariable Long employeeId) {
        employeeService.deleteEmployeeById(employeeId);
        return "redirect:/employees";
    }
}
