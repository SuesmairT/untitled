package main.java.org.example._2024_01_30;

import main.java.org.example._2024_01_18.Scanner;

import java.util.Arrays;
import java.util.Locale;

public class Task300124 {
    public static void main(String[] args) {
        //Дана строка состоящая из n букв затем n чисел, сформировать из символов этой строки новую строку где на чётных позициях будут цифры, на не чётных буквы.
        //Пример Java9999  ->  J9a9v9a9
        // Hello56789 -> H5e6l7l8o9
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите слово: ");
        String string = "42";
        System.out.println(replaceNumbers(string));
        System.out.println(Arrays.toString(getIndexes("string with last s")));
        System.out.println(Arrays.toString(get369elem("0123456789"))
        );
        System.out.println(getFirstNum("HelloWord2024"));
        System.out.println(searchXW("Way Of LifeX"));
    }

    public static String replaceNumbers(String string) {
        StringBuilder bilder = new StringBuilder();
        String numbers = string.substring(string.length() / 2);
        int index = 0;
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0) {
                bilder.append(string.charAt(index));
            } else {
                bilder.append(numbers.charAt(index));
                index++;
            }
        }
        return bilder.toString();
    }

    //Дана строка. Показать номера символов, совпадающих с последним символом строки.
    public static int[] getIndexes(String string) {
        System.out.println(string);
        char lastChar = string.charAt(string.length() - 1);
        System.out.println(lastChar);
        char[] charArray = string.toCharArray();
        System.out.println(Arrays.toString(charArray));
        int[] result = new int[string.length()];
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == lastChar) {
                result[count] = i;
                count = count + 1;
            }
        }
        result = Arrays.copyOf(result, count);
        return result;
    }

    //Дана строка. Показать третий, шестой, девятый и так далее символы.
    public static char[] get369elem(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 3; i < string.length(); i = i + 3) {//i+=3
            stringBuilder.append(string.charAt(i));
        }
        String result = stringBuilder.toString();
        return result.toCharArray();
    }

    //6.Дана строка. Вывести первые три символа и последние три символа, если длина строки больше 5. Иначе вывести первый символ столько раз, какова длина строки
    public static String getFirstNum(String string) {
        StringBuilder result = new StringBuilder();
        if (string.length() > 5) {
            String firstElem = string.substring(0, 3);
            String lastElem = string.substring(string.length() - 3);
            result.append(firstElem).append(lastElem);
        } else {
            char firstChar = string.charAt(0);
            for (int i = 0; i < string.length(); i++) {
                result.append(firstChar);
            }
        }
        return result.toString();
    }

    //7.	Дана строка. Определите, какой символ в ней встречается раньше: 'x' или 'w'.
// Если какого-то из символов нет, вывести сообщение об этом.
    public static String searchXW(String string) {
        String stringLowerCase = string.toLowerCase();
        int indexOfX = stringLowerCase.indexOf('x');
        int indexOfW = stringLowerCase.indexOf('w');
        if (indexOfX == -1) {
            return "Х не встречается";
        } else if (indexOfW == -1) {
            return "W не встречается";
        } else if (indexOfX < indexOfW){
            return "Х встречается раньше";
        } else  {
        return "W встречается раньше";

    }

}
//1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.

//            2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
//
//            3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.
//
//            4. Ввести число от 1 до 12. Вывести на консоль название месяца, соответ-ствующего данному числу. (Осуществить про
//1.Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.


}



