package main.java.org.example._2024_02_01;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person vasia = new Person("Vasil Vasilich", 30);

        person.move();
        person.talk();

        person.setFullName("Alex");
        person.setAge(46);

        person.move();
        person.talk();
        System.out.println();

        System.out.println();

        vasia.talk();
        vasia.move();
    }
}
