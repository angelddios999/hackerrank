package com.angel.hackerrank;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RepeatedStringTest {

    @Test
    public void testRepeatedString() {
        String string = "aba";
        long characters = 10;
        long result = RepeatedString.repeatedString(string, characters);
        assertEquals(7, result);
    }

    @Test
    public void testRepeatedString2() {
        String string = "epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";
        long characters = 549382313570L;
        long result = RepeatedString.repeatedString(string, characters);
        assertEquals(16481469408L, result);
    }
}