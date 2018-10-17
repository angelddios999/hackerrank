package com.angel.hackerrank;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JumpingOnCloudsTest {

    @Test
    public void testJumpingOnClouds() {
        int[] input = new int[]{0, 0, 1, 0, 0, 1, 0};
        int result = JumpingOnClouds.jumpingOnClouds(input);
        assertEquals(4, result);
    }
}