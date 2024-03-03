package org.example._2024_02_21;

public class Pegasus extends Horse {
private int speedFly;
    public Pegasus(String name, int weight, int speed, int speedFly) {
        super(name, weight, speed);
        this.speedFly = speedFly;
        //---------------
         }

     public void fly (){
         System.out.println(name + "летает со скоростью" + speedFly);
     }



    @Override
    public String toString() {
        return "Pegasus{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}
