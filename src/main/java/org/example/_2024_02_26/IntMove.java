package org.example._2024_02_26;

public interface IntMove {
    boolean isWings = false;
    default  void move() {
        System.out.println("С помощью ног" + CalcSpeed());
    }
 private int CalcSpeed()  {
        return 20;
 }
}


