package main.java.org.example._2024_01_18;

import java.util.Scanner;

public class NewClass1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x");
        int x = scanner.nextInt();
        System.out.println("Введите y");
        int y = scanner.nextInt();
        String result = getResult(x, y);
        System.out.println(result);

    }


    public static String getResult(int x, int y) {
        if(x < 1 || x >3 || y < 1 || y >3) {
            return "ERROR";
           }
    if(x == 2 || x == 3) {
        return "X = "  + x;
    } else {
        return "Y = "  + y;
    }
    }
}
