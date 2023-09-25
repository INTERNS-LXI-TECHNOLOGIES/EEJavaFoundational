package com.lxisoft.yasirhussain.amazon.product;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import com.lxisoft.yasirhussain.amazon.product.model.*;

public class ProductTest {

    private ProductModel product;

    @BeforeEach
    public void testSetup()
    {
        product = new ProductModel();
    }

    @Test
    public void testCompany()
    {
        product.setProductName("Meta VR Product");
        assertEquals("Meta VR Product", product.getProductName(),"Application Script Running Successfully");
    }
}