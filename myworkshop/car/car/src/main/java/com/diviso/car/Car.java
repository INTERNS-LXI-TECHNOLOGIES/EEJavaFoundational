package com.diviso.car;

public class Car {
    private Part part;

    public Car(Part part) {
        this.part = part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public Part getPart() {
        return part;
    }

    public void printCarDetails() {
        part.partDetails();
    }

}