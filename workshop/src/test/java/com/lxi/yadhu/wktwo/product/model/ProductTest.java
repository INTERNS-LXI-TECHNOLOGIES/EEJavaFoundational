package com.lxi.yadhu.wktwo.product.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.lxi.yadhu.wktwo.product.model.*;
public class ProductTest{

private Product product;
@BeforeEach
    void setUp() {
        product = new Product();
    }


    @Test
    void testAddition() {
        product.setProductCategory("home goods");
        assertEquals("home goods",product.getProductCategory(), "Expected value is home goods");
    }
}