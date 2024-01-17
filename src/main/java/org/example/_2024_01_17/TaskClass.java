package main.java.org.example._2024_01_17;

public class TaskClass {
    public static void main(String[] args) {
//int a = 10;
//int b = 15;
//int c = 20;
//int d = 25;
//int e = 30;
//int f = a;
//a = b;
//b = c;
//c = d;
//d = e;
//e = f;
//System.out.println(a);
//System.out.println(b);
//System.out.println(c);
//System.out.println(d);
//System.out.println(e);
//        Дано трехзначное число. Вывести на экран все цифры этого числа.
//
//                Пример: 345
//        Вывод в консоль: Число 345 -> 3, 4, 5
int a = 345;
int b = a / 100;
int c = (a - b*100)/10;
int d = a % 10;
System.out.println("Число " + a + " -> "+ b + ", "+ c + ", "+ d);


}
}
