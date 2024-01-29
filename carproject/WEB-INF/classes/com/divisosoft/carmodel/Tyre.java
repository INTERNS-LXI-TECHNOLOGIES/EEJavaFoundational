package com.divisosoft.carmodel;
public class Tyre{
    int size;
    String name;
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Tyre [size=" + size + ", name=" + name + "]";
    }
}