package com.lxisoft.fairuz.workshoptwo.company.model;

public class Company{

    private String name;
    private int stock_price;
    public Company(String name, int stock_price) {
        this.name = name;
        this.stock_price = stock_price;
    }

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock_price() {
        return stock_price;
    }

    public void setStock_price(int stock_price) {
        this.stock_price = stock_price;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", stock_price=" + stock_price +
                '}';
    }
}