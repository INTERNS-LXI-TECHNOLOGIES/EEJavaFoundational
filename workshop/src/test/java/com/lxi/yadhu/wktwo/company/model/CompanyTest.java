package com.lxi.yadhu.wktwo.company.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.lxi.yadhu.wktwo.company.model.*;
public class CompanyTest{

private Company company;
@BeforeEach
    void setUp() {
       company = new Company();
    }


    @Test
    void testAddition() {
        company.setIndustry("Finance");
        assertEquals("Finance",company.getIndustry(), "Expected value is Finance");
    }
}