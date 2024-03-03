package org.example;

import java.util.Arrays;

//дано 2 массива уникальных значений, вывести третий в котором будут храниться только
// уникальные совпадения с первых двух массивов
public class Task080224 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getIntersections(new int[] {1,5,9,23,65,7}, new int[] {6,7,14,73,23})));
    int [] array1 = {1,5,9,23,65,7};
    int [] array2 = {6,7,14,73,23};
        System.out.println(Arrays.toString(getIntersections(array1, array2)));

    }















    public static int[] getIntersections(int[] array1,int[] array2){
        int[] result = new int[array1.length];
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    result[count] = array1[i];
                    count ++;
                    break;

                }
            }
        }
        return Arrays.copyOf(result, count);
    }

}

