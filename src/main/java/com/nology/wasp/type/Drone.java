package com.nology.wasp.type;

public class Drone extends Wasp {

    public Drone() {
        super("Drone", 68, 12, "alive");
    }

    @Override
    public void makeSound() {
        System.out.println("poor drone :c");
    }
}
