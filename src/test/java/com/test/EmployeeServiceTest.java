package com.test;

import com.test.model.CompanyStatistics;
import com.test.model.Employee;
import com.test.model.Position;

import com.test.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeServiceTest {
    private EmployeeService employeeService;
    private Employee jan, anna, piotr, kris;

    @BeforeEach
    public void setUp(){
        employeeService = new EmployeeService();
        jan = new Employee("Jan", "Kowalski", "jank@techcorp.pl", "TechCorp", Position.PROGRAMISTA);
        anna = new Employee("Anna", "Nowak", "annan@techcorp.pl", "TechCorp", Position.MANAGER);
        piotr = new Employee("Piotr", "Adamski", "piotra@otherco.com", "OtherCo", Position.PREZES);

        kris = new Employee("Kris", "Niski", "kris.n@tech.com", "TechCorp", Position.PROGRAMISTA);
        kris.setSalary(7000);

        employeeService.addEmployee(jan);
        employeeService.addEmployee(anna);
        employeeService.addEmployee(piotr);
    }

    @Test
    public void testAddEmployeeIncreseSizeByOne(){
        Employee newEmployee = new Employee("Adam", "Nowy", "adam.n@new.com", "NewCo", Position.STAZYSTA);

        employeeService.addEmployee(newEmployee);

        assertEquals(4, employeeService.getEmployees().size());
    }
    
}