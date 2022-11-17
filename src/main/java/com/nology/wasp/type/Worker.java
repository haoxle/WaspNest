package com.nology.wasp.type;

import com.nology.wasp.type.Wasp;

public class Worker extends Wasp {

    public Worker() {
        super("worker", 60, 10, "alive");
    }

    @Override
    public void makeSound() {
        System.out.println("poor worker :c");
    }
}
