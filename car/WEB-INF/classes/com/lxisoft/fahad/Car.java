package com.lxisoft.fahad;
public class Car{
    private String name;
    private String colour;

    @java.lang.Override
    public java.lang.String toString() {
        return "Car" +
                "name=" + name +
                ", colour=" + colour +
                ;
    }

    public java.lang.String getColour() {
        return colour;
    }

    public void setColour(java.lang.String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}