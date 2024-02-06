package main.java.org.example._2024_01_31;

import java.util.Arrays;
import java.util.Scanner;

public class Ks310124 {
    public static void main(String[] args) {
        String[] strings12 = {"HelloWorld", "java", "pineapple", "324", "ocean"};
        System.out.println(Arrays.toString(findLongShortSrting(strings12)));
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите количество строк: ");
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите строкy " + i + ": ");
            strings[i] = scanner.next();


        }
        System.out.println(Arrays.toString(sortStringsByLengths(strings)));
    }

    //Ввести n строк с консоли, найти самую короткую и самую длинную строки.
    // Вывести найденные строки и их длину.
    public static String[] findLongShortSrting(String[] strings) {
        int minLengths = strings[0].length();
        int maxLengts = strings[0].length();
        int minIndex = 0;
        int maxIndex = 0;
        String[] result = new String[2];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < minLengths) {
                minLengths = strings[i].length();
                minIndex = i;
            }
            if (strings[i].length() > maxLengts) {
                maxLengts = strings[i].length();
                maxIndex = i;
            }
        }
        result[0] = strings[minIndex] + " " + minLengths;
        result[1] = strings[maxIndex] + " " + maxLengts;
        return result;
    }
    //Scanner scanner = new Scanner(System.in);
    //        System.out.println(" Введите количество строк: ");
    //        int n = scanner.nextInt();
    //        String[] strings12 = new String[n];
    //        for (int i = 0; i < n; i++) {
    //            System.out.println("Введите строкy " + i  + ": ");
    //            strings12[i] = scanner.next();
    //        }
    //        System.out.println(Arrays.toString(findShortesLongesStrings(strings12)));
    //public static String[] findShortesLongesStrings(String[] strings12) {
    //        int minLengths = strings12[0].length();
    //        int maxLengths = strings12[0].length();
    //        String[] result = new String[2];
    //        int indexMax = 0;
    //        int indexMin = 0;
    //        for (int i = 0; i < strings12.length; i++) {
    //            if (minLengths > strings12[i].length()) {
    //                minLengths = strings12[i].length();
    //                indexMin = i;
    //    //            }
    //            if (maxLengths < strings12[i].length()) {
    //                maxLengths = strings12[i].length();
    //                indexMax = i;
    //
    //            }
    //
    //        }
    //        result[0] = strings12[indexMin] + ", " + minLengths;
    //        result[1] = strings12[indexMax] + ", " + maxLengths;
    //        return result;
    //
    //    }

    //-----------------------------------------------------------------------------------
    //2. Ввести n строк с консоли. Упорядочить
    // и вывести строки в порядке возрастания (убывания) значений их длины.

    public static String[] sortStringsByLengths(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length - i - 1; j++) {
                if (strings[j].length() > strings[j + 1].length()) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;

                }
            }

        }
        return strings;
    }
}
