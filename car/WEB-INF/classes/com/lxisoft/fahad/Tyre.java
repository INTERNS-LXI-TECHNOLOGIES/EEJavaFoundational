package com.lxisoft.fahad;

public class Tyre {

    private String brand;
    private String size;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString() {
        return "Tyre{" +
                "brand=" + brand +
                ", size=" + size +
                '}';
    }
}