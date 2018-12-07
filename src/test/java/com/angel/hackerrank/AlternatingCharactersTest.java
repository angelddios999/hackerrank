package com.angel.hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class AlternatingCharactersTest {
    @Test
    public void testAlternatingCharacters() {
        String input = "AAABBB";
        int minimumDeletions = AlternatingCharacters.alternatingCharacters(input);
        Assert.assertEquals(4, minimumDeletions);
    }
}
