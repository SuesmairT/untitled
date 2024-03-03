package main.java.org.example._2024_02_05;
//Создайте абстрактный класс Shape и его наследники Circle, Square, Triangle. Класс Shape содержит метод draw() и переменную хранящую цвет. Классы Circle, Square, Triangle  содержат переменные радиус, сторона квадрата, сторона треугольника соответственно.
//
//        В main создать массив содержащий эти фигуры. В цикле у каждой фигуры вызвать метод draw , который будет выводить в консоль сообщение в формате «Draw <форма фигуры> of <цвет> color with a <соответствующий параметр>».
public class Task050224 {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 6);
        Triangle triangle = new Triangle("green", 12);
        Square square = new Square("yellow", 8);

        Shape [] shapes = {circle, triangle, square};
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }
    }


}
