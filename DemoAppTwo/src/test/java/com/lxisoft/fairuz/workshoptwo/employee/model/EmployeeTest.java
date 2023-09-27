package com.lxisoft.fairuz.workshoptwo.employee.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.lxisoft.fairuz.workshoptwo.employee.model.*;

public class EmployeeTest {

    private Employee employeeModel;

    @BeforeEach
    void setUp(){
        employeeModel = new Employee();
    }

    @Test
    void testAddition(){
        employeeModel.setName("fairuz");
        assertEquals("fairuz",employeeModel.getName(),"Expected value fairuz");
    }
}


