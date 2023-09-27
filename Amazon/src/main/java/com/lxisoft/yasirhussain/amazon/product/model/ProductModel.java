package com.lxisoft.yasirhussain.amazon.product.model;

import com.lxisoft.yasirhussain.amazon.product.controller.ProductController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ProductModel implements Comparable<ProductModel>{

    private static final Logger logger = LogManager.getLogger(ProductController.class);

    private String productName;
    private String productCategory;
    private String productPrice;
    private String productId;

    public ProductModel() {

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductId() {
        logger.info("getting "+ productId);

        return productId;
    }

    public void setProductId(String productId) {
        logger.info("setting "+ productId);
        this.productId = productId;
    }
    public ProductModel(String productName, String productCategory, String productPrice)
    {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
    }
    public ProductModel(String productName, String productCategory, String productPrice, String productId)
    {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.productId = productId;
    }

    @Override
    public String toString()
    {
        return "Product Name" + productName + " Product Category" + productCategory + " Product Price" + productPrice + " Product Id" + productId + "";
    }


    @Override
    public int compareTo(ProductModel o) {
        return this.productId.compareTo(o.productId);
    }
}