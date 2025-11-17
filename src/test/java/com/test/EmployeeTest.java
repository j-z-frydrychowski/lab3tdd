package com.test;

import com.test.model.Employee;
import com.test.model.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.Provider;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private final Position defPosition = Position.getPosition("Programista");
    private final Employee employee = new Employee("Jan", "Kowalski", "jankowalski@techcorp.pl", "TechCorp", defPosition);

    @Test
    public void testConstructor() {
        Employee employee = new Employee();
        assertEquals("TechCorp", employee.getCompanyName());
    }

    @Test
    public void testConstructorSetBaseSalary() {
        assertEquals(defPosition.getSalary(), employee.getSalary());
    }

    @Test
    public void testGetName(){
        assertEquals("Jan", employee.getName());
    }

    @Test
    public void testGetSurname(){
        assertEquals("Kowalski", employee.getSurname());
    }

    @Test
    public void testGetEmail(){
        assertEquals("jankowalski@techcorp.pl", employee.getEmail());
    }

    @Test
    public void testGetCompanyName(){
        assertEquals("TechCorp", employee.getCompanyName());
    }

    @Test
    public void testGetJobTitle(){
        assertEquals(defPosition, employee.getJobTitle());
    }

    @Test
    public void testGetSalary(){
        assertEquals(defPosition.getSalary(), employee.getSalary());
    }
    
}
