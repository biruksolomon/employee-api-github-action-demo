package com.example.employee.controller;

import com.example.employee.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping
    public List<Employee> getEmployees() {

        return List.of(
                new Employee(1L, "John"),
                new Employee(2L, "Alice")
        );
    }
}