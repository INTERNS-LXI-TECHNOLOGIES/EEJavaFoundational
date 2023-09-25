package com.lxisoft.workshoptwo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import com.lxisoft.ibrahim.workshoptwo.company.companymodel.*;

public class CompanyTest
{

    private CompanyModel companymodel;

    @BeforeEach
    void setUp() {
        companymodel = new CompanyModel();
    }


    @Test
    void testCode() {
        companymodel.setCompany_name("amazon");
        assertEquals("amazon",companymodel.getCompany_name(),"the name is amazon");
    }
}