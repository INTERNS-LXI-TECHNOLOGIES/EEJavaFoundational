package com.lxisoft.fairuz.workshoptwo.product.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.lxisoft.fairuz.workshoptwo.product.model.*;

public class ProductTest {

    private Product productModel;

    @BeforeEach
    void setUp(){
        productModel = new Product();
    }

    @Test
    void testAddition(){
        productModel.setName("fairuz");
        assertEquals("fairuz",productModel.getName(),"Expected value fairuz");
    }
}
