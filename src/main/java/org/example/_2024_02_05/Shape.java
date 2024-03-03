package main.java.org.example._2024_02_05;

public class Shape {
    private String color;

        public Shape(String color) {
        this.color = color;
    }

    public void draw () {
        System.out.println("Рисуем фигуру " + color + " цвета");
    }

    public String getColor(){
            return color;
    }
}
