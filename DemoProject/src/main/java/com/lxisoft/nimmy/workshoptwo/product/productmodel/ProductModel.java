package com.lxisoft.nimmy.workshoptwo.product.productmodel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProductModel {
    private String productCategory;
    private static final Logger logger = LogManager.getLogger(ProductModel.class);

    public String getProductCategory() {
        logger.info("This is an informational message.");

        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    



}
