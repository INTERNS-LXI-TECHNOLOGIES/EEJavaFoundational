package com.lxisoft.workshoptwo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import com.lxisoft.ibrahim.workshoptwo.employee.employeemodel.*;

public class EmployeeTest
{

    private EmployeeModel employeemodel;

    @BeforeEach
    void setUp() {
        employeemodel = new EmployeeModel();
    }


    @Test
    void testCode() {
        employeemodel.setFirst_name("ibrahim");
        assertEquals("ibrahim",employeemodel.getFirst_name(),"the name is ibrahim");
    }
}