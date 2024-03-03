package org.example._2024_02_23;

import java.util.Random;

public class EvilCreature extends Character {

    private int force;

    private int protection;

    public EvilCreature(String name, int force, int protection) {
        super(name);
        this.force = force;
        this.protection = protection;
    }

    @Override
    public int countForce() {
        return force;
    }

    @Override
    public int countProtection() {
        return protection;
    }

    @Override
    public String toString() {
        return "EvilCreature='" + getName() + '\'' +
                ", health=" + getHealth() +
                ", force=" + force +
                ", protection=" + protection;
    }
}