package org.example._2024_02_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        Calculator calculator = new Calculator();
//        System.out.println("Enter expresson");
//        String input = scanner.nextLine();
//        System.out.println(calculator.getResult(input));

        char inputYesNo;
        do {
            System.out.println("Enter expression");
            String input = scanner.nextLine();
            System.out.println(calculator.getResult(input));
            System.out.println("Woud you like to do another calc? (Y/N)");
            inputYesNo = scanner.nextLine().charAt(0);
        } while (inputYesNo == 'Y');
        System.out.println("Goodbye");
    }
}
