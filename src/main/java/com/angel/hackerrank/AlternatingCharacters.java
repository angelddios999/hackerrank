package com.angel.hackerrank;

import java.util.Objects;

public class AlternatingCharacters {
    static int alternatingCharacters(String s) {
        int minimumDeletions = 0;

        if(Objects.nonNull(s)) {
            char currentCharacter = s.charAt(0);
            for (int i = 1; i < s.length(); i++) {
                char charAtIndex = s.charAt(i);
                if(currentCharacter == charAtIndex) {
                    minimumDeletions++;
                } else {
                    currentCharacter = charAtIndex;
                }
            }
        }

        return minimumDeletions;
    }
}
