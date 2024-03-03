package main.java.org.example._2024_01_29;
import java.util.Arrays;
public class Task290124 {
    public static void main(String[] args) {
String string = "Java";
int [] array = {1,2,3};
System.out.println(Arrays.toString(array));
array[0] = 4;
array[1] = 5;
array[2] = 6;
        System.out.println(Arrays.toString(array));
        System.out.println(getStrings("HalloWorld"));
        System.out.println(String.join(",", string, string, string));
        System.out.println(getFirstMiddleLast("Hello"));
    }
    //1.	Дана строка. Вывести ее три раза через запятую и показать количество символов в ней.

    //3.	Сформировать строку из 10 символов. На четных позициях должны находится четные цифры, на нечетных позициях - буквы.
    //4.	Дана строка. Показать номера символов, совпадающих с последним символом строки.
    //5.	Дана строка. Показать третий, шестой, девятый и так далее символы.
    //6.	Дана строка. Вывести первые три символа и последние три символа, если длина строки больше 5. Иначе вывести первый символ столько раз, какова длина строки
    //7.	Дана строка. Определите, какой символ в ней встречается раньше: 'x' или 'w'. Если какого-то из символов нет, вывести сообщение об этом.

public static String getStrings(String string) {
        String string5 = (string + "," + string + ","+ string + ",");
return string5;
}
//2.	Дана строка. Вывести первый, последний и средний (если он есть) символы.
public static String getFirstMiddleLast(String string) {

        char[] chars = string.toCharArray();
        char first = chars[0];
        char last = chars[chars.length-1];
    if (chars.length%2 != 0) {
        char middle = chars[chars.length/2];
//        char[] arr1 = {first, middle, last};//создание нового массива 1 вариант
//        String result = new String(arr1);
        String result = new String(new char[] {first, middle, last});//создание нового массива 2 вариант короткий
        return result;
            }
    String result = new String(new char[] {first, last});
    return result;
}
}
