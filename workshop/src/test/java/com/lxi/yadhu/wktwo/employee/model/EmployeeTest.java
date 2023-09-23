package com.lxi.yadhu.wktwo.employee.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.lxi.yadhu.wktwo.employee.model.*;
public class EmployeeTest{

private Employee employee;
@BeforeEach
    void setUp() {
        employee = new Employee();
    }


    @Test
    void testAddition() {
        employee.setEmail("example123@gmail.com");
        assertEquals("example123@gmail.com",employee.getEmail(), "Expected value is example123@gmail.com");
    }
}