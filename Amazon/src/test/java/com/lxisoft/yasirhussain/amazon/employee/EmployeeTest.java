package com.lxisoft.yasirhussain.amazon.employee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import com.lxisoft.yasirhussain.amazon.employee.model.*;

public class EmployeeTest {

    private EmployeeModel employee;

    @BeforeEach
    public void testSetup()
    {
        employee = new EmployeeModel();
    }

    @Test
    public void testCompany()
    {
        employee.setEmployeeName("yasir hussain");
        assertEquals("yasir hussain", employee.getEmployeeName(),"Application Script Running Successfully");
    }
}