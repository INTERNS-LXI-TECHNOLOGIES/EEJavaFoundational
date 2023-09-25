package com.lxisoft.nimmy.workshoptwo.employeetest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.lxisoft.nimmy.workshoptwo.employee.employeemodel.*;

public class EmployeeTest {

    private EmployeeModel employeeModel;

    @BeforeEach
    void setUp() {
        // Initialize the Calculator instance before each test
        employeeModel = new EmployeeModel();
    }

    @Test
    void testAddition() {
        employeeModel.setEmployeeId("111111");
        assertEquals("111111", employeeModel.getEmployeeId(),"Expected value 111111");
    }
}

