package org.example._2024_02_15;

import java.text.DecimalFormat;

/**
 * Написать программу "Калькулятор" таким образом, чтобы она принимала от пользователя
 * вычисляемое математическое выражение в виде одной строки. Например,
 * так 10.5*5+1-7.1 и последовательно выполняла бы указанные арифметические операции над аргументами.
 * Результат вычислений необходимо вывести с точностью до двух чисел после запятой в
 * формате <значение переменной argumentOne> <знак математической операции>
 * <значение переменной argumentTwo> = <значение переменной результата>
 * Если пользователь хочет выполнить операцию деления и в качестве значения второго аргумента ввёл значение 0, то программа должна вывести сообщение о том, что на 0 делить нельзя.
 * возможные операции + - * /
 */


public class Calculator {

    public String getResult(String string) {
        int operationsCount = getOperationsCount(string);
        double[] arguments = getArguments(string, operationsCount);
        char[] operations = getOperations(string, operationsCount);
        double result = arguments[0];
        for (int i = 1; i < arguments.length; i++) {
            result = calculate(result, operations[i - 1], arguments[i]);
        }
        return getResultString(arguments, operations, result);
    }

    private String getResultString(double[] arguments, char[] operations, double result) {
        StringBuilder stringBuilder = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (int i = 0; i < arguments.length; i++) {
            if (i == arguments.length - 1) {
                stringBuilder.append(decimalFormat.format(arguments[i]))
                        .append(" ");
            }else {
                stringBuilder.append(decimalFormat.format(arguments[i]))
                        .append(" ")
                        .append(operations[i])
                        .append(" ");

            }
        }
        stringBuilder.append("= ").append(decimalFormat.format(result));
        return stringBuilder.toString();

    }

    private double calculate(double argument1, char operation, double argument2) {
        switch (operation) {
            case '+':
                return argument1 + argument2;
            case '-':
                return argument1 - argument2;
            case '*':
                return argument1 * argument2;
            case '/':
                if (argument2 == 0) {
                    System.out.println("Error, division bei zero");
                    System.exit(0);
                } else {
                    return argument1 / argument2;
                }
            default:
                return 0;
        }
    }

    private char[] getOperations(String string, int operationsCount) {
        char[] operations = new char[operationsCount];
        int indexOperation = 0;
        for (int i = 0; i < string.length(); i++) {
            if (isOperation(string.charAt(i))) {
                char operation = string.charAt(i);
                operations[indexOperation] = operation;
                indexOperation++;
            }
        }
        return operations;
    }

    private double[] getArguments(String string, int operationsCount) {
        double[] arguments = new double[operationsCount + 1];
        int startPoint = 0;
        int indexDouble = 0;
        for (int i = 0; i < string.length(); i++) {
            if (isOperation(string.charAt(i))) {
                String argumentString = string.substring(startPoint, i);
                startPoint = i + 1;
                double argument = Double.parseDouble(argumentString);
                arguments[indexDouble] = argument;
                indexDouble++;
            }
            if (i == string.length() - 1) {
                String argumentString = string.substring(startPoint);
                double argument = Double.parseDouble(argumentString);
                arguments[indexDouble] = argument;
            }
        }
        return arguments;
    }

    private int getOperationsCount(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (isOperation(string.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    private boolean isOperation(char c) {
        if (c == '+' || c == '-' || c == '/' || c == '*') {
            return true;
        } else {
            return false;
        }
    }
}
