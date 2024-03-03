package org.example._2024_02_14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test140224 {
    @Test
    void getArrayWithDeletedNumber() {
        //given
        int[] array = {16,27,14,8,11,96,27,58};
        int number = 27;
        int[] expected = {16,14,8,11,96,58};

        //when
        int[] actual =Task140224.getArrayWithDeletedNumber(array,number);
        //then
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void searchIndexMinPositiveEven() {
        //given
        int[] array = {-6,13,92,-18,5,0,-134,26,58};
        int expected =7;
        //whenn
        int actual = Task140224.searchIndexMinPositiveEven(array);

        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getSumPositiveAfterZeroPositiveCase() {
        //given
        int[] array = {-8,26,14,0,-19,72,45,18,-6};
        int expected = 135;

        //when
        int actual =Task140224.getSumPositiveAfterZero(array);

        //then
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void getSumPositiveAfterZeroNegativeCase() {

        //given
        int[] array = {-8, 26, 14, -19, 72, 45, 18, -6};
        int expected = -1;

        //when
        int actual = Task140224.getSumPositiveAfterZero(array);

        //then

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void getSumPositiveAfterZeroPositiveCaseZeroAt0Index() {

        //given
        int[] array = {543, 26, 14, -19, 72, 45, 18, -6, 0};
        int expected = 0;

        //when
        int actual = Task140224.getSumPositiveAfterZero(array);

        //then

        Assertions.assertEquals(expected, actual);
    }

}
