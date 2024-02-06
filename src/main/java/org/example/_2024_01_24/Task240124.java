package main.java.org.example._2024_01_24;

import java.util.Arrays;

public class Task240124 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        int[] array3;
        int[] array4 = {10, 6, 1, 8, 2, 5, 8, 7};


        printArray(new int[] {0, 1, 2, 3, 4, 5, 6, 7});


        printArray(array1);



        array3 = Arrays.copyOf(array2, 16);
        printArray(array3);
        Arrays.fill(array1, 8);

        array3 = Arrays.copyOfRange(array2, 3, 4);
        printArray(array3);


        Arrays.sort(array4);
        printArray(array4);

        System.out.println(Arrays.binarySearch(array4, 1));

    }


    //метод Arrays.toString
    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
}
