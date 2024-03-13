package com.divisosoft.company;

public class Product
{
    String name;
    int price;
    String productCategory;
    double rate ;
    String date;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getProductCategory() {
        return productCategory;
    }
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", productCategory=" + productCategory + ", rate=" + rate
                + ", date=" + date + "]";
    }

}