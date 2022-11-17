package com.nology.wasp.type;

public class Wasp {


    protected String type;
    protected int hp;
    protected int dmgPerHit;

    protected String state;

    public Wasp(String type, int hp, int dmgPerHit, String state) {
        this.dmgPerHit = dmgPerHit;
        this.type = type;
        this.hp = hp;
        this.state = state;
    }

    public void setDmgPerHit(int dmgPerHit) {
        this.dmgPerHit = dmgPerHit;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setHp(String type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public int getDmgPerHit() {
        return dmgPerHit;
    }

    public String getType() {
        return type;
    }

    public String getState() {
        return state;
    }


    public boolean hitWasp(){
        this.hp -= this.dmgPerHit;
        return false;
    }

    public boolean deadState(){
        this.state = "dead";
        return false;
    }

    public void makeSound() {

    }
}
