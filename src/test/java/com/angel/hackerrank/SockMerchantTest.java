package com.angel.hackerrank;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SockMerchantTest {

    @Test
    public void testSockMerchant() {
        int[] input = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
        int result = SockMerchant.sockMerchant(input.length, input);
        assertEquals(3, result);
    }
}
