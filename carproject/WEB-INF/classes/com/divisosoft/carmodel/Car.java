package com.divisosoft.carmodel;
public class Car{

    String name;
    String color;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Car [name=" + name + ", color=" + color + "]";
    }
}