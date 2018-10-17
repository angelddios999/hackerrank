package com.angel.hackerrank;

/**
 * {@link https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem}
 */
public class JumpingOnClouds {
    static int jumpingOnClouds(int[] c) {
        int index = 0;
        int jumps = 0;
        int length = c.length;

        while(index < length - 1) {
            if(index + 2 < length && c[index+2] == 0) {
                index+=2;
                jumps++;
            } else {
                index++;
                jumps++;
            }
        }

        return jumps;
    }
}
