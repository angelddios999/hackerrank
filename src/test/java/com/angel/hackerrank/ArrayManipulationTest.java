package com.angel.hackerrank;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArrayManipulationTest {

    @Test
    public void testArrayManipulation() {
        int arraySize = 5;
        int[][] operations = new int[][]{
            {1, 2, 100},
            {2, 5, 100},
            {3, 4, 100}
        };
        long result = ArrayManipulation.arrayManipulation(arraySize, operations);
        assertEquals(200, result);
    }
}