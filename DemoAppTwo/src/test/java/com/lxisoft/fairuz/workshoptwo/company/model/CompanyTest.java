  package com.lxisoft.fairuz.workshoptwo.company.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.lxisoft.fairuz.workshoptwo.company.model.*;

    public class CompanyTest {
    private Company companyModel;
    @BeforeEach
    void setUp(){
        companyModel = new Company();
    }
    @Test
    void testAddition(){
        companyModel.setName("fairuz");
        assertEquals("fairuz",companyModel.getName(),"Expected value fairuz");
    }
}