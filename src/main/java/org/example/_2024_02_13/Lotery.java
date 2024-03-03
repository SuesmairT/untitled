package org.example._2024_02_13;

import java.util.Arrays;
import java.util.Random;

/**
 * Реализовать консольное приложение лотерея
 * 1.	Создать класс Лотерея, реализовать в нём методы по генерации массива случайных чисел с выигрышными номерами, и метод который определяет являются ли номера пользователя выгрышными.
 */
public class Lotery {
    public int[] getWinNumbers() {
        int[] winNumbers = new int[5];
        for (int i = 0; i < winNumbers.length; i++) {
           winNumbers [i]  = getRandomNumer();
            for (int j = 0; j < i; j++) {
                if (winNumbers[i] ==  winNumbers[j]) {
                    i--;
                }
            }
        }
        return winNumbers;
    }

    private int getRandomNumer() {
        Random random = new Random();
        int num = random.nextInt(50) + 1;
        return num;
    }

//    public boolean isWinner(int[] array1, int[] array2) {
////        Arrays.sort(array1);
////        Arrays.sort(array2);
////        Arrays.equals(array1, array2);
////        return Arrays.equals(array1, array2);
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array2.length; j++) {
//            if (array1[i] == array2[j]) {
//                break;
//            }
//        }
//        }
//    }
}
