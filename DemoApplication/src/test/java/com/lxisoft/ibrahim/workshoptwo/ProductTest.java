package com.lxisoft.workshoptwo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import com.lxisoft.ibrahim.workshoptwo.product.productmodel.*;

public class ProductTest
{

    private ProductModel productmodel;

    @BeforeEach
    void setUp() {
        productmodel = new ProductModel();
    }


    @Test
    void testCode() {
        productmodel.setProduct_category("laptop");
        assertEquals("laptop",productmodel.getProduct_category(),"the name is laptop");
    }
}