package main.java.org.example._2024_01_23;

public class Task230124  {
    public static void main(String[] args) {
        int[] myList = {5, 24, 15, -10, 0, 12, 55, -4, 35, -43, 75};
        System.out.println("Наибольшее значение:" + getMaxNumber(myList));
        System.out.println("Наибольшее значение с четным индексом:" + getMaxEven(myList));
        System.out.println("Сумма четных положительных и четных:" + getPlusSum(myList));
        System.out.println("Среднее арифметическое:" + getMediumNumber(myList));
    }

    public static int getMaxNumber(int[] myList) {
        int max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }

        }
        return max;
    }

    public static int getMaxEven(int[] myList) {
        int max = myList[0];
        for (int i = 0; i < myList.length; i = i + 2) {
            if (myList[i] > max) {
                max = myList[i];
            }

        }
        return max;

    }


    public static int getPlusSum(int[] myList) {
        int sum = 0;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > 0 && myList[i] % 2 == 0) ;
            {
                sum += myList[i];
            }
        }

        return sum;
    }
    public static double getMediumNumber(int[] myList) {
       double sum = 0;
        for (int i = 0; i < myList.length; i++) {
            sum = sum + myList [i];
        }
        double medium = sum / myList.length;
         return medium;
}



}