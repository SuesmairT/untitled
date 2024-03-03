package main.java.org.example._2024_02_05;

public class Square extends Shape{
    private int sideOfSquare;

    public Square(String color, int sideOfSquare) {
        super(color);
        this.sideOfSquare = sideOfSquare;
            }

    @Override
    public void draw() {
        System.out.println("Рисуем квадрат " + getColor() + " цвета со стороной " + sideOfSquare);
    }
}
