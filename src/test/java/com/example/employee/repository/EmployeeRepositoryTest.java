package com.example.employee.repository;

import com.example.employee.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;


import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository repository;

    @Test
    void shouldSaveEmployee() {

        Employee employee = new Employee(
                "Biruk",
                "Solomon",
                "biruk@test.com",
                "IT"
        );

        Employee saved = repository.save(employee);

        assertNotNull(saved.getId());
    }
}