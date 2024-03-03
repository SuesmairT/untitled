package main.java.org.example._2024_02_05;

public class Triangle extends Shape {
    private int sideOfTriangle;

    public Triangle(String color, int sideOfTriangle) {
        super(color);
        this.sideOfTriangle = sideOfTriangle;
        }
    @Override
    public void draw() {
        System.out.println("Рисуем треугольник " + getColor() + " цвета со стороной " + sideOfTriangle);
    }
}
