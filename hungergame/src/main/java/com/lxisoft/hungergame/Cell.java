package com.lxisoft.hungergame;

public class Cell {

    private int number ;
    private boolean isLocked;

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Cell(int number) {
        this.number = number;
    }

    public Cell() {
    }

    
}
