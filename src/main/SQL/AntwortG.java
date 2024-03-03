package org.example;
import java.util.Random;
public class AntwortG {

    abstract class Character {
        String name;
        int health = 100;

        Character(String name) {
            this.name = name;
        }

        abstract void introduce();
        abstract int countForce();
        abstract int countProtection();
        abstract void fight(Character opponent);
    }

    class EvilCreature extends Character {
        int force;
        int protection;

        EvilCreature(String name, int force, int protection) {
            super(name);
            this.force = force;
            this.protection = protection;
        }

        @Override
        void introduce() {
            System.out.println("EvilCreature: " + name + ", Force: " + force + ", Protection: " + protection);
        }

        @Override
        int countForce() {
            return force;
        }

        @Override
        int countProtection() {
            return protection;
        }

        static EvilCreature generateRandomEvilCreature() {
            Random random = new Random();
            String name = "Evil" + random.nextInt(100);
            int force = random.nextInt(50) + 1;
            int protection = random.nextInt(50) + 1;
            return new EvilCreature(name, force, protection);
        }
    }

    class Superhero extends Character {
        int force;
        Weapon weapon;
        Protection protection;

        Superhero(String name, int force, Weapon weapon, Protection protection) {
            super(name);
            this.force = force;
            this.weapon = weapon;
            this.protection = protection;
        }

        @Override
        void introduce() {
            System.out.println("Superhero: " + name + ", Force: " + force + ", Weapon: " + weapon.getName() +
                    ", Protection: " + protection.getName());
        }

        @Override
        int countForce() {
            return force + weapon.getPower();
        }

        @Override
        int countProtection() {
            return protection.getStrength();
        }
    }

    class Weapon {
        private String name;
        private int power;

        Weapon(String name, int power) {
            this.name = name;
            this.power = power;
        }

        int getPower() {
            return power;
        }

        String getName() {
            return name;
        }
    }

    class Protection {
        private String name;
        private int strength;

        Protection(String name, int strength) {
            this.name = name;
            this.strength = strength;
        }

        int getStrength() {
            return strength;
        }

        String getName() {
            return name;
        }
    }

    public class SuperheroBattle {
        public static void main(String[] args) {
            Superhero superhero1 = new Superhero("Hero1", 50, new Weapon("Sword", 20), new Protection("Shield", 15));
            Superhero superhero2 = new Superhero("Hero2", 45, new Weapon("Hammer", 18), new Protection("Armor", 12));

            EvilCreature evilCreature1 = EvilCreature.generateRandomEvilCreature();
            EvilCreature evilCreature2 = EvilCreature.generateRandomEvilCreature();

            superhero1.introduce();
            superhero2.introduce();
            evilCreature1.introduce();
            evilCreature2.introduce();

            superhero1.fight(evilCreature1);
            superhero2.fight(evilCreature2);
        }
}
}
