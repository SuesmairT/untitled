package main.java.org.example._2024_02_06;

import javax.xml.stream.Location;

public class Vet {
    public void treatAnimal(Animal animal) {
        System.out.println("Animal is located" + animal.getLocation() + "and eats" + animal.getFood());
    }

}
