package com.divisosoft.car;
public class Tyre{
   private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tyre [size=" + size + "]";
    }
}