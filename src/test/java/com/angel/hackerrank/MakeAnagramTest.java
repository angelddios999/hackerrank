package com.angel.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeAnagramTest {

    @Test
    public void testMakeAnagram() {
        String stringA = "fcrxzwscanmligyxyvym";
        String stringB = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        assertEquals(30, MakeAnagram.makeAnagram(stringA, stringB));
    }
}
