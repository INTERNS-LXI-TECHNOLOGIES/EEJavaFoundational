package com.divisosoft.car;

public class Car{
   private String name;
   private Door door;
   private Tyre tyre;

    public Door getDoor() {
    return door;
}

public void setDoor(Door door) {
    this.door = door;
}

public Tyre getTyre() {
    return tyre;
}

public void setTyre(Tyre tyre) {
    this.tyre = tyre;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car [name=" + name + "]";
    }
}