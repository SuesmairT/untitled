package org.example._2024_02_14;

import java.util.Arrays;

///**Задача
// Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива, вернув новый массив нужной длинны.
//
public class Task140224 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArrayWithDeletedNumber(new int[]{16, 27, 14, 8, 11, 96, 27, 58}, 27)));
//
        getArray(new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5});
    }

    public static int[] getArrayWithDeletedNumber(int[] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                count++;
            }
        }
        int[] result = new int[array.length - count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                result[index] = array[i];
                index++;
            }
        }
        return result;
    }


    //Задача
    //В массиве из целых чисел найти индекс минимального из четных положительных элементов, при их отсутствии вывести -1
    public static int searchIndexMinPositiveEven(int[] array) {
        int index = -1;
        int minPositivEven = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0 && array[i]>0 && array[i]<minPositivEven){
                minPositivEven = array[i];
                index = i;

            }
        }
        return index;
    }
    //Задача
//Вычислить сумму положительных элементов массива после первого нуля (при наличии нуля).

    public static int getSumPositiveAfterZero(int[] array) {
        int indexOfZero = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] ==0){
                indexOfZero = i;
                break;
            }
        }
        if (indexOfZero == -1){
            return -1;
        }
        int sumPositiveElem = 0;
        for (int i = indexOfZero; i < array.length ; i++) {
            if (array[i] > 0){
                sumPositiveElem = sumPositiveElem + array[i];

            }
        }
        return sumPositiveElem;
    }
//Новая задача
    public static void getArray(int[] array) {
        int[] arrayPositive = new int[array.length];
        int[] arrayNegative = new int[array.length];
        int indexPositive = 0;
        int indexNegative = 0;


        for (int i = 0; i < array.length; i++) {
            if(array[i]>0) {
                arrayPositive[indexPositive] = array[i];
                indexPositive++;
                }
            if(array[i]<0) {
                arrayNegative[indexNegative] = array[i];
                indexNegative++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(Arrays.copyOf(arrayPositive,indexPositive)));
        System.out.println(Arrays.toString(Arrays.copyOf(arrayNegative, indexNegative)));
    }
}