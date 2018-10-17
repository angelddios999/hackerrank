package com.angel.hackerrank;

/**
 * {@link https://www.hackerrank.com/challenges/repeated-string/problem}
 */
public class RepeatedString {

    static long repeatedString(String s, long n) {
        long length = s.length();
        long timesInString = timesOfAInString(s, length);
        timesInString *= n / length;
        long remainder = n % length;
        if (remainder > 0) {
            timesInString += timesOfAInString(s, remainder);
        }

        return timesInString;
    }

    private static long timesOfAInString(String string, long limit) {
        long timesInString = 0L;
        char[] chars = string.toCharArray();
        for(int i = 0; i < limit; i++) {
            if(chars[i] == 'a'){
                timesInString++;
            }
        }
        return timesInString;
    }
}