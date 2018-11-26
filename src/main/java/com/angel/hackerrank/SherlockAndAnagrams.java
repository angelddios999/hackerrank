package com.angel.hackerrank;

import java.util.Arrays;
import java.util.Objects;

public class SherlockAndAnagrams {
    static int sherlockAndAnagrams(String s) {
        int anagrams = 0;
        if (Objects.nonNull(s) && s.length() > 1) {
            int originalLength = s.length();
            // Iterating strings size 1 to length-1
            for(int currentLength = 1; currentLength < originalLength; currentLength++) {
                for(int i = 0; i + currentLength < originalLength; i++) {
                    String stringA = s.substring(i, i + currentLength);
                    for(int j = i + 1; j + currentLength <= originalLength; j++) {
                        String stringB = s.substring(j, j + currentLength);
                        if (isAnagram(stringA, stringB)) {
                            anagrams++;
                        }
                    }
                }
            }
        }

        return anagrams;
    }

    static boolean isAnagram(String stringA, String stringB) {
        if(stringA != null && stringB != null && stringA.length() == stringB.length()) {
            if(stringA.length() > 1) {
                // If the string is more than two characters, sort the characters first.
                char[] chars = stringA.toCharArray();
                Arrays.sort(chars);
                stringA = new String(chars);
                chars = stringB.toCharArray();
                Arrays.sort(chars);
                stringB = new String(chars);
            }

            return stringA.equals(stringB);
        }

        return false;
    }
}