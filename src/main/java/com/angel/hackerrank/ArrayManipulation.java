package com.angel.hackerrank;

public class ArrayManipulation {

    static long arrayManipulation(int n, int[][] queries) {
        long maxValue = Integer.MIN_VALUE;

        if (n > 0) {
            long[] zeroesArray = new long[n];
            for (int[] queryRow : queries) {
                long newMaxValue = applyQuery(queryRow, zeroesArray, maxValue);
                if (newMaxValue > maxValue) {
                    maxValue = newMaxValue;
                }
            }
        }

        return maxValue;
    }

    private static long applyQuery(int[] query, long[] zeroesArray, long maxValue) {
        // Subtracting one since it's zero index
        int start = query[0] -1;
        int end = query[1] -1;
        int value = query[2];
        long newMaxValue = maxValue;

        if(start >=0 && end < zeroesArray.length) {
            for (int i = start; i <= end; i++) {
                long newValue = zeroesArray[i] + value;
                zeroesArray[i] = newValue;
                if (newValue > newMaxValue) {
                    newMaxValue = newValue;
                }
            }
        }

        return newMaxValue;
    }
}