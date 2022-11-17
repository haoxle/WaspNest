package com.nology.wasp.hive;

import com.nology.wasp.type.Drone;
import com.nology.wasp.type.Queen;
import com.nology.wasp.type.Wasp;
import com.nology.wasp.type.Worker;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;


public class Hive {
    protected ArrayList<Wasp> wasps = new ArrayList<>();

    public void addWasp(Wasp wasp) {
        this.wasps.add(wasp);
    }

    public int getHiveCount() {
        return this.wasps.size();
    }

    public void getWasp() {
        for (Wasp wasp : wasps) {
            if (wasp.getHp() <= 0) {
                wasp.setState("dead");
                wasp.setHp(0);
            }
            System.out.println(wasp.getHp() + " " + wasp.getType() + " " + wasp.getState());
        }
    }

    public Hive() {
        for (int i = 0; i < 8; i++)
            this.wasps.add(new Worker());
        for (int i = 0; i < 5; i++)
            this.wasps.add(new Drone());
        this.wasps.add(new Queen());
    }

    public void anyItem() {
        boolean game = false;
        String cont = new String();

        while (!game) {
            int randomIndex = (int) (Math.random() * wasps.size());
//                if (wasps.get(randomIndex).getState() == "dead") {
//
//                }
            getWasp();
            System.out.println(wasps.get(randomIndex));
            System.out.println("Press enter to fight!");
            try {
                System.in.read();
            } catch (Exception e) {
                e.printStackTrace();
            }

            for (Wasp wasp : wasps) {
                if (wasp == wasps.get(randomIndex) && wasp.getHp() > 0 && !game) {
                    wasp.hitWasp();
                    wasp.makeSound();
                } else if (wasps.get(randomIndex).getType() == "Queen" && wasps.get(randomIndex).getHp() <= 3) {
                    game = true;

                }
            }

        }
        System.out.println("You win");
    }
}

