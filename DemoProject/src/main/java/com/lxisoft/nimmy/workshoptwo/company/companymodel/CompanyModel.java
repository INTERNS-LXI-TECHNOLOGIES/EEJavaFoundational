package com.lxisoft.nimmy.workshoptwo.company.companymodel;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
public class CompanyModel {

    private static final Logger logger = LogManager.getLogger(CompanyModel.class);
    private String companyName;
    public String getCompanyName() {

        logger.info("getting the productname"+companyName);
        return companyName;
    }

    public void setCompanyName(String companyName) {
        logger.info("setting the productname"+companyName);
        this.companyName = companyName;
    }





}