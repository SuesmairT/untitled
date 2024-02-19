package org.example._2024_01_30;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task300124Test {

    @Test
    void replaceNumbers() {
        //given
        String string = "Jva999";
        String expected = "ERROR";

        //when

        String actual = Task300124.replaceNumbers(string);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void replaceNumbers2() {
        //given

        String expected = "ERROR";

        //when

        String actual = Task300124.replaceNumbers(null);

        //then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void getIndexes() {
        //given
        String string = "HelloWorldl";
        int [] expected = {2, 3, 8, 10};

        //when

        int[] actual = Task300124.getIndexes(string);

        //then
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void get369elem() {
    }

    @Test
    void getFirstNum() {
    }

    @Test
    void searchXW() {
    }
}