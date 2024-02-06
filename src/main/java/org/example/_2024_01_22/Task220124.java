package main.java.org.example._2024_01_22;

public class Task220124 {
    public static void main(String[] args) {
        //Напишите программу, которая выводит на экран числа от 1 до 100. При этом вместо чисел, кратных трем, программа должна
        //выводить слово Fizz, а вместо чисел, кратных пяти — слово Buzz, Если число кратно трём и пяти одновременно, то программа должна выводить слово FizzBuzz
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println(i + " = FizzBuzz");
//            }
//            else if (i % 3 == 0) {
//                System.out.println(i + " = Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println(i + " = Buzz");
//            }
//            else{
//                System.out.println(i);
//            }
//        }
        //    Вывести на экран “равнобедренный треугольник”, всё “рёбра” которого состоят из единиц, “медиана” равна 14, а вся “площадь” заполнена нулями =)

        int height = 14; // высота треугольника

        // Выводим равнобедренный треугольник
        for (int i = 0; i <= height; i++) {
            if (i == 0) {
                System.out.println(1);
            }
            System.out.print(1);
            for (int j = 0; j < i ; j++) {
                System.out.print(0);
            }
            System.out.println(1);
        }
//        ===вторая часть елки
        for (int i = 13; i <= height; i--) {
             {
                System.out.println(1);
            }
            System.out.print(1);
            for (int j = 0; j < i ; j++) {
                System.out.print(0);
            }
            System.out.println(1);
        }

    }
}