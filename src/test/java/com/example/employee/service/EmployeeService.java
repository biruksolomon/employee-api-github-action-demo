package com.example.employee.service;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {

    @Test
    void shouldReturnEmployee() {

        EmployeeRepository repository =
                mock(EmployeeRepository.class);

        Employee employee =
                new Employee(
                        "Biruk",
                        "Solomon",
                        "biruk@test.com",
                        "IT");

        when(repository.findById(1L))
                .thenReturn(Optional.of(employee));

        EmployeeService service =
                new EmployeeServiceImpl(repository);

        Employee result =
                service.getEmployee(1L);

        assertEquals(
                "Biruk",
                result.getFirstName());
    }
}