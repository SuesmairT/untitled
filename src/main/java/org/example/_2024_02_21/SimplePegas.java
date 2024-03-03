package org.example._2024_02_21;

public class SimplePegas {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        System.out.println(horse1);

        Horse horse2 = new Horse("Вася", 5000, 50);
        System.out.println(horse2);

        Pegasus pegasus1 = new Pegasus("Пегас", 3000, 60, 50);
        pegasus1.run();
        pegasus1.fly();
        System.out.println(pegasus1);
    }

}
