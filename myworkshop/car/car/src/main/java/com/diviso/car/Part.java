package com.diviso.car;

public class Part {

    public void partDetails() {

        for (int door = 0; door <= 4; door++) {
            System.out.println("Door" + door);
        }

        for (int tyre = 0; tyre <= 4; tyre++) {
            System.out.println("Tyre" + tyre);
        }

        System.out.println("Steering");

    }

}
