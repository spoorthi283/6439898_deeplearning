package com.example.ems.controller;

import com.example.ems.entity.Employee;
import com.example.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository repo;

    @PostMapping
    public Employee create(@RequestBody Employee emp) {
        return repo.save(emp);
    }

    @GetMapping
    public List<Employee> all() {
        return repo.findAll();
    }

    @GetMapping("/paged")
    public Page<Employee> getPagedEmployees(@RequestParam int page, @RequestParam int size) {
        return repo.findAll(PageRequest.of(page, size));
    }

    @GetMapping("/sorted")
    public List<Employee> getSortedEmployees(@RequestParam String sortBy) {
        return repo.findAll(Sort.by(sortBy));
    }

    @GetMapping("/paged-sorted")
    public Page<Employee> getPagedSorted(@RequestParam int page, @RequestParam int size, @RequestParam String sortBy) {
        return repo.findAll(PageRequest.of(page, size, Sort.by(sortBy)));
    }
}