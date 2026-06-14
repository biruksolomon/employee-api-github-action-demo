package com.example.employee.service;

import com.example.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployee(Long id);

    void deleteEmployee(Long id);
}