package com.lxisoft.nimmy.workshoptwo.companytest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.lxisoft.nimmy.workshoptwo.company.companymodel.*;

public class CompanyTest {

    private CompanyModel companyModel;

    @BeforeEach
    void setUp() {
        // Initialize the Calculator instance before each test
        companyModel = new CompanyModel();
    }

    @Test
    void testAddition() {
        companyModel.setCompanyName("Microsoft");
        assertEquals("Microsoft", companyModel.getCompanyName(),"Expected value Microsoft");
    }
}
