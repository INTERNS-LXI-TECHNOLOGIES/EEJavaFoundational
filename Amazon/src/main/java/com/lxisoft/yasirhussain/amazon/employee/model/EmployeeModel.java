package com.lxisoft.yasirhussain.amazon.employee.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmployeeModel {
    private static final Logger logger = LogManager.getLogger(EmployeeModel.class);

    private String employeeName;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        logger.info("This is an informational message.");
        logger.warn("This is a warning message.");
        logger.error("This is an error message.");

        return employeeName;
    }

}
