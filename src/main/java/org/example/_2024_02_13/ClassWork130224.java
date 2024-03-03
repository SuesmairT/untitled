//package org.example._2024_02_13;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
///**
// * Реализовать консольное приложение лотерея
// * 1.	Создать класс Лотерея, реализовать в нём методы по генерации массива случайных чисел с выигрышными номерами, и метод который определяет являются ли номера пользователя выгрышными.
// * 2.	Размер массива с выигрышными номерами, как и массива номеров от пользователя составляет 5 номеров
// * 3.	Для получения номеров от пользователя использовать Сканер
// * 4.	Ограничить игровые номера от 1 до 50
// * 5.	Распечатать на консоль результат победил ли пользователь,  номера лотереи и номера введенные пользователем
// * 6.	* Для сравнения массивов НЕ использовать сортировку.
// * 7.	* Исключите повторяемость выпадающих номеров. Т.е. Номера от 1 до 50 должны выпадать только один раз
// *
// */
//public class ClassWork130224 {
//    public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     int[] userNumbers = new int[5];
//        for (int i = 0; i < userNumbers.length; i++) {
//            int num = i+1;
//            System.out.println("Введите число # " + num);
//            userNumbers[i] = scanner.nextInt();
//            if (userNumbers[i] >50 || userNumbers[i] <1) {
//                System.out.println("Error. False Number");
//                i--;
//            }
//        }
////        Lotery lotery = new Lotery();
////        int [] luckyNumbers = lotery.getWinNumbers();
////        if(lotery.isWinner(userNumbers, luckyNumbers)) {
////            System.out.println("Winner winner");
////        }
//        else {
//            System.out.println("Looser");
//        }
//        System.out.println("Your numbers is " + Arrays.toString(userNumbers));
//        System.out.println("Winners numbers is " + Arrays.toString(luckyNumbers));
//    }
//}
