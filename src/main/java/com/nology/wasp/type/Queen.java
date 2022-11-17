package com.nology.wasp.type;

public class Queen extends Wasp {

    public Queen() {
        super("Queen", 80, 7, "alive");
    }

    @Override
    public void makeSound() {
        System.out.println(":c why me");
    }

}
