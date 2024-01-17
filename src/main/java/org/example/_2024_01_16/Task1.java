package main.java.org.example._2024_01_16;

public class Task1 {
    public static void main(String[] args) {
        //Вывести на экран в одну строку все нечётные числа от 0 до 100.
        //while
//        int i = 0;
//        while (i <= 100) {
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//            i++; // i = i+1
//        }

        //do while
//        int i = 0;
//        do {
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//            i++; // i = i+1
//        } while (i <= 100);

        //for
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }


    }
}
