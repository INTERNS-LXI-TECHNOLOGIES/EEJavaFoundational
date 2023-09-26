package com.lxisoft.yasirhussain.amazon.product;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import com.lxisoft.yasirhussain.amazon.product.model.*;

public class ProductTest {

    private ProductModel product;

    @BeforeEach
    void setUp() {
        product = new ProductModel();
    }

    @Test
    public void testCompany()
    {
        product.setProductId("Meta123");
        assertEquals("Meta123", product.getProductId(),"Application Script Running Successfully");
    }
}