package com.angel.hackerrank;

import org.junit.Test;

public class CheckMagazineTest {

    @Test
    public void testCheckMagazine() {
        String[] magazine = new String[]{"two", "times", "three", "is", "not", "four"};
        String[] note = new String[]{"two", "times", "two", "is", "four"};
        CheckMagazine.checkMagazine(magazine, note);
    }
}