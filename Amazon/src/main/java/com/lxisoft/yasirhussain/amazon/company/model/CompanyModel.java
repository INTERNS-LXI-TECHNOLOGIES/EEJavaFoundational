package com.lxisoft.yasirhussain.amazon.company.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompanyModel {
    private static final Logger logger = LogManager.getLogger(CompanyModel.class);

    private String companyName;

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public String getCompanyName()
    {
        logger.info("This is an informational message.");
        logger.warn("This is a warning message.");
        logger.error("This is an error message.");
        
        return companyName;
    }
}
