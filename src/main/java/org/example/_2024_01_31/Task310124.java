package main.java.org.example._2024_01_31;

//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Task310124 {
//
//    public static void main(String[] args) {
//
////        Scanner scanner = new Scanner(System.in);
////        System.out.println(" Введите количество строк: ");
////        int n = scanner.nextInt();
////        String[] strings = new String[n];
////        for (int i = 0; i < n; i++) {
////            System.out.println("Введите строкy " + i  + ": ");
////            strings[i] = scanner.next();
////
////            System.out.println(Arrays.toString(sortStringsByLengths(strings)));
//
////        System.out.println(Arrays.toString(findShortesLongesStrings(strings)));
//        }
//
//
//    //1.Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
//    public static String[] findShortesLongesStrings(String[] strings) {
//        int minLengths = strings[0].length();
//        int maxLengths = strings[0].length();
//        String[] result = new String[2];
//        int indexMax = 0;
//        int indexMin = 0;
//        for (int i = 0; i < strings.length; i++) {
//            if (minLengths > strings[i].length()) {
//                minLengths = strings[i].length();
//                indexMin = i;
//
//            }
//            if (maxLengths < strings[i].length()) {
//                maxLengths = strings[i].length();
//                indexMax = i;
//
//            }
//
//        }
//        result[0] = strings[indexMin] + ", " + minLengths;
//        result[1] = strings[indexMax] + ", " + maxLengths;
//        return result;
//    }
//    //2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
//    public static String[] sortStringsByLengths(String[] strings) {
//        for (int i = 0; i < strings.length ; i++) {
//            for (int j = 0; j < strings.length -i -1; j++) {
//                if (strings[j].length() > strings[j+1].length()) {
//                    String temp = strings[j];
//                    strings[j] = strings[j+1];
//                    strings[j+1]=temp;
//    }
//}
//            return strings;
//        }
//
//    }

