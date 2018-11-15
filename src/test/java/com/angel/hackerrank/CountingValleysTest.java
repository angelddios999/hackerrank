package com.angel.hackerrank;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CountingValleysTest {

    @Test
    public void testCountingValleys() {
        int steps = 8;
        String path = "UDDDUDUU";
        int result = CountingValleys.countingValleys(steps, path);
        assertEquals(1, result);
    }
}
