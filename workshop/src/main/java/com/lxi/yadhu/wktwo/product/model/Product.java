package com.lxi.yadhu.wktwo.product.model;

public class Product implements Comparable<Product>{

   private String productName; 
   private String productCategory; 
   private String productPrice; 
   private String productBrand; 
   private String productManufacturer; 
   private String productReleaseDate; 
   private String productAvailability; 
   private String productId;

public Product(String productName, String productCategory, String productPrice, String productBrand,
        String productManufacturer, String productReleaseDate, String productAvailability, String productId) {
    this.productName = productName;
    this.productCategory = productCategory;
    this.productPrice = productPrice;
    this.productBrand = productBrand;
    this.productManufacturer = productManufacturer;
    this.productReleaseDate = productReleaseDate;
    this.productAvailability = productAvailability;
    this.productId = productId;
}

public Product(String productName, String productCategory, String productPrice, String productBrand,
        String productManufacturer, String productReleaseDate, String productAvailability) {
    this.productName = productName;
    this.productCategory = productCategory;
    this.productPrice = productPrice;
    this.productBrand = productBrand;
    this.productManufacturer = productManufacturer;
    this.productReleaseDate = productReleaseDate;
    this.productAvailability = productAvailability;
}

public Product() {
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
public String getProductBrand() {
    return productBrand;
}
public void setProductBrand(String productBrand) {
    this.productBrand = productBrand;
}
public String getProductManufacturer() {
    return productManufacturer;
}
public void setProductManufacturer(String productManufacturer) {
    this.productManufacturer = productManufacturer;
}
public String getProductReleaseDate() {
    return productReleaseDate;
}
public void setProductReleaseDate(String productReleaseDate) {
    this.productReleaseDate = productReleaseDate;
}
public String getProductAvailability() {
    return productAvailability;
}
public void setProductAvailability(String productAvailability) {
    this.productAvailability = productAvailability;
}
public String getProductId() {
    return productId;
}
public void setProductId(String productId) {
    this.productId = productId;
}
@Override
public String toString() {
    return "Product [productName=" + productName + ", productCategory=" + productCategory + ", productPrice="
            + productPrice + ", productBrand=" + productBrand + ", productManufacturer=" + productManufacturer
            + ", productReleaseDate=" + productReleaseDate + ", productAvailability=" + productAvailability
            + ", productId=" + productId + "]";
}

@Override
public int compareTo(Product o) {
    return this.productId.compareTo(o.productId);
    // TODO Auto-generated method stub
}


   
}