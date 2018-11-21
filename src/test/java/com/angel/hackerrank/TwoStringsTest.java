package com.angel.hackerrank;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TwoStringsTest {

    @Test
    public void testTwoStrings() {
        String s1 = "wouldyoulikefries";
        String s2 = "abcabcabcabcabcabc";
        String result = TwoStrings.twoStrings(s1, s2);
        assertEquals("NO", result);
    }
}