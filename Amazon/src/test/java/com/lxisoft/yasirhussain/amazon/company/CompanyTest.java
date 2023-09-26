package com.lxisoft.yasirhussain.amazon.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import com.lxisoft.yasirhussain.amazon.company.model.*;

public class CompanyTest {

    private CompanyModel company;

    @BeforeEach
    public void testSetup()
    {
        company = new CompanyModel();
    }

    @Test
    public void testCompany()
    {
        company.setCompanyName("LXI Technologies");
        assertEquals("LXI Technologies", company.getCompanyName(),"Application Script Running Successfully");
    }
}