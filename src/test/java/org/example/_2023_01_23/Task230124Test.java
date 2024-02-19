package test.java.org.example._2023_01_23;

import main.java.org.example._2024_01_23.Task230124;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task230124Test {

    @Test
    void getMaxNumber() {
//        given
        int[] array = {1, 9, 2, 8, 3, 7, 4, 5};
        int expected = 9;

//        when
        int actual = Task230124.getMaxNumber(array);

//        then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMaxEven() {
//        given
        int[] array = {1, 9, 2, 8, 3, 7, 4, 5};
        int expected = 4;

//        when
        int actual = Task230124.getMaxEven(array);

//        then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getPlusSum() {
        //        given
        int[] array = {1, 9, 14, 26, 2, 8, 3, 7, 4, 5};
        int expected = 79;

//        when
        int actual = Task230124.getPlusSum(array);

//        then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMediumNumberTest() {
        //        given
        int[] array = {1, 9, 2, 8, 3, 7, 4, 5};
        double expected = 4.875;

//        when
        double actual = Task230124.getMediumNumber(array);

//        then
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    void getMediumNumberTest() {
//        //        given
//        int[] array = {1, 9, 2, 8, 3, 7, 4, 5};
//        double expected = 4.875;
//
////        when
//        double actual = Task230124.getMediumNumber(array);
//
////        then
//        Assertions.assertEquals(expected, actual);
//    }
}