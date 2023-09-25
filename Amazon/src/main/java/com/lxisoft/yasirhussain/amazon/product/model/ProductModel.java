package com.lxisoft.yasirhussain.amazon.product.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProductModel {
    private static final Logger logger = LogManager.getLogger(ProductModel.class);
    
    private String productName;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        logger.info("This is an informational message.");
        logger.warn("This is a warning message.");
        logger.error("This is an error message.");
        
        return productName;
    }
}