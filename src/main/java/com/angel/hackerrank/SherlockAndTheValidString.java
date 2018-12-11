package com.angel.hackerrank;

import java.util.Objects;

public class SherlockAndTheValidString {
    static String isValid(String s) {
        String output = "YES";

        if(Objects.nonNull(s)) {
            int[] charOccurrences = new int[26];
            int firstOccurrence = 25;

            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int index = c - 'a';
                charOccurrences[index] ++;
                if(index < firstOccurrence) {
                    firstOccurrence = index;
                }
            }

            int minOccurrences = charOccurrences[firstOccurrence];
            boolean higherFound = false;
            boolean lowerFound = false;
            for(int i = 0; i < 26; i++) {
                int occurrences = charOccurrences[i];
                if(occurrences > 0) {
                    if(occurrences == minOccurrences) {
                        // If is the same occurrences the continue
                        continue;
                    } else {
                        if(occurrences > 1 && Math.abs(occurrences - minOccurrences) > 1) {
                            // Any difference greater than 1 will make an invalid string
                            output = "NO";
                            break;
                        } else {
                            if(occurrences < minOccurrences) {
                                if(lowerFound || higherFound) {
                                    output = "NO";
                                    break;
                                } else {
                                    lowerFound = true;
                                }
                            } else {
                                if(lowerFound || higherFound) {
                                    output = "NO";
                                    break;
                                } else {
                                    higherFound = true;
                                }
                            }
                        }
                    }
                }
            }
        }

        return output;
    }
}
