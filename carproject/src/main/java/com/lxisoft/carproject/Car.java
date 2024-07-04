package com.lxisoft.carproject;


public class Car{


    private Door door;
    private Tyre tyre;

    public Car(Door door,Tyre tyre)
    {
     this.door=door;
     this.tyre=tyre;
    }

public void printDoor()
{
door.createDoor();
}

public void printTyre()
{
    tyre.createTyre();
}
}