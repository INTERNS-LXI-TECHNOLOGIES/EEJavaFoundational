package com.lxisoft.nimmy.workshoptwo.producttest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.lxisoft.nimmy.workshoptwo.product.productmodel.*;

public class ProductTest {

    private ProductModel productModel;

    @BeforeEach
    void setUp() {
        // Initialize the Calculator instance before each test
        productModel = new ProductModel();
    }

    @Test
    void testAddition() {
        productModel.setProductCategory("technology");
        assertEquals("technology", productModel.getProductCategory(),"Expected value technology");
    }
}

