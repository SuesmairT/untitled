package main.java.org.example._2024_02_06;

public class Dog extends Animal{
    private boolean isFriend;
    public Dog(String food, String location, boolean isFriend) {
        super(food, location);
        this.isFriend = isFriend;
    }

    @Override
    public void makeNoise()    {
        if (isFriend){
        System.out.println("Dog barks joyfully");
        } else {
            System.out.println("Dog barks angry");
        }

    }

    @Override
    public void eat()    {
        System.out.println("Dog eat" + getFood());
    }

    public boolean getIsFriend() {
        return isFriend;
    }
}
