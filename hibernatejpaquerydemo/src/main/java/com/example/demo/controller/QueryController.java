package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Department;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class QueryController {

    @Autowired
    private EmployeeRepository employeeRepo;

    @Autowired
    private QueryService queryService;

    @GetMapping("/high-earners/{salary}")
    public List<Employee> highEarners(@PathVariable double salary) {
        return employeeRepo.findHighEarners(salary);
    }

    @GetMapping("/low-earners/{salary}")
    public List<Employee> lowEarners(@PathVariable double salary) {
        return employeeRepo.findLowEarners(salary);
    }

    @GetMapping("/count-high-earners/{salary}")
    public long countHighEarners(@PathVariable double salary) {
        return employeeRepo.countHighEarners(salary);
    }

    @GetMapping("/criteria-high-earners/{salary}")
    public List<Employee> criteriaHighEarners(@PathVariable double salary) {
        return queryService.getEmployeesUsingCriteria(salary);
    }

    @GetMapping("/departments-with-employees")
    public List<Department> getDepartmentsWithEmployees() {
        return employeeRepo.fetchDepartmentsWithEmployees();
    }
}