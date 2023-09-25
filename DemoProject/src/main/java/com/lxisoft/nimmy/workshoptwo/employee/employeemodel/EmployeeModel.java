package com.lxisoft.nimmy.workshoptwo.employee.employeemodel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.lxisoft.nimmy.workshoptwo.employee.employeemodel.EmployeeModel;


public class EmployeeModel {
    

    private static final Logger logger = LogManager.getLogger(EmployeeModel.class);

    private String employeeId;
    
    public String getEmployeeId() {
        logger.info("This is an informational message.");
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

}