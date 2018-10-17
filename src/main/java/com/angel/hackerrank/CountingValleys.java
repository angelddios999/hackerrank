package com.angel.hackerrank;

public class CountingValleys {

    static int countingValleys(int n, String s) {
        char[] steps = s.toCharArray();
        int level = 0; // Sea level
        int valleys = 0;
        boolean inValley = false;
        for(char step : steps) {
            if('U' == step) {
                level++;
            } else if('D' == step) {
                level--;
            }

            if (inValley) {
                if(level >=0) {
                    inValley = false;
                    valleys++;
                }
            } else {
                if (level < 0) {
                    inValley = true;
                }
            }
        }

        return valleys;
    }
}