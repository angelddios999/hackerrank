package com.angel.hackerrank;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SherlockAndAnagramsTest {

    @Test
    public void testSockMerchant() {
        String input = "kkkk";
        int result = SherlockAndAnagrams.sherlockAndAnagrams(input);
        assertEquals(10, result);
    }
}