package com.diviso.car;

public class Car {
    private String name;
    private int numberOfDoors;
    private int numberOfTyres;
    private boolean hasSteering;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public boolean isHasSteering() {
        return hasSteering;
    }

    public void setHasSteering(boolean hasSteering) {
        this.hasSteering = hasSteering;
    }
}
