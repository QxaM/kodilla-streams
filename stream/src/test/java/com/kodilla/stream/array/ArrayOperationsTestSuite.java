package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int[] theArray = {4, 5, 8, 19, 13, 16, 1, 7};

        //When
        double resultAverage = ArrayOperations.getAverage(theArray);

        //Then
        assertEquals(9.125, resultAverage, 0.0001);
    }
}
