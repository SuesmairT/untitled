package main.java.org.example._2024_02_05;

public class Circle extends Shape {

    private  int radius;
    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг " + getColor() + " цвета с радиусом " + radius);
    }
}
