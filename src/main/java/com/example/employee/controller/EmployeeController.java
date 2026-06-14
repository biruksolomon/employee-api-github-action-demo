package com.example.employee.controller;

import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping
    public Employee createEmployee(
            @RequestBody Employee employee) {

        return service.createEmployee(employee);
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(
            @PathVariable Long id) {

        return service.getEmployee(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(
            @PathVariable Long id) {

        service.deleteEmployee(id);
    }
}