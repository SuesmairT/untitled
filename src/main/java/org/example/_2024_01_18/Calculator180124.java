package main.java.org.example._2024_01_18;

import java.util.Scanner;

public class Calculator180124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char znak = scanner.next().charAt(0);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double result = calc(a, b, znak);
        System.out.println(result);
    }

    public static double calc(double a, double b, char znak) {
        switch (znak) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return Double.NaN;
        }
    }
}
