package com.lxisoft.yasirhussain.amazon.product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import com.lxisoft.yasirhussain.amazon.product.model.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    private ProductModel product;

    @BeforeEach
    public void testSetUp() {

        product = new ProductModel();
        product.setProductId("yaser");
    }

    @Test
    public void testProduct()
    {
//        product.setProductId("Meta123");
        assertEquals("yaser", product.getProductId(),"Application Script Running Successfully");
    }
}
