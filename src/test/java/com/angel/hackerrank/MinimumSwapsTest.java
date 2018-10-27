package com.angel.hackerrank;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MinimumSwapsTest {

    @Test
    public void testMinimumSwaps() {
        int[] input = new int[]{1, 3, 5, 2, 4, 6, 8};
        int result = MinimumSwaps.minimumSwaps(input);
        assertEquals(3, result);
    }
}