package org.example._2024_02_23.Meine;

public abstract class Character {
    private String name;
    private int health = 100;

    public Character(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


    public void introduce() {
    System.out.println("Привет, меня зовут "+ name);
}

     public abstract int countForce();
    public abstract int countProtection();



    public void fight(Character another){
//        int countForce1 = countForce();
//        int countForce2 = another.countForce();



//        int countProtection = countForce;
//        System.out.println(countForce.equals(another.countForce));
    }


}
