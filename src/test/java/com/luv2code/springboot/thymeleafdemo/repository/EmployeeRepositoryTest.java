package com.luv2code.springboot.thymeleafdemo.repository;

import com.luv2code.springboot.thymeleafdemo.dao.EmployeeRepository;
import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Configuration;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeRepositoryTest(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Test
    public void EmployeeRepository_SaveAll_ReturnSavedEmployees(){

        // Arrange
        Employee employee = new Employee("jessica","palmer","jessica@gmail.com");
        // Act
        Employee saveEmployee = employeeRepository.save(employee);
        // Assert
        Assertions.assertEquals(new Employee(),saveEmployee);
    }


}
