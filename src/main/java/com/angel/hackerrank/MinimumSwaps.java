package com.angel.hackerrank;

import java.util.Arrays;

public class MinimumSwaps {

    static int minimumSwaps(int[] arr) {
        int arrLen = arr.length;
        int swaps = 0;
        int [] sortedArray = Arrays.copyOf(arr, arrLen);
        Arrays.sort(sortedArray);
        
        for (int i = 0; i < arrLen; i++) {
            if (arr[i] != sortedArray[i]) {
                swaps++;
                for (int j = i + 1; j < arrLen; j++) {
                    if (arr[j] == sortedArray[i] ) {
                        int tmp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = tmp;
                        break;
                    }
                }
            }
        }
        return swaps;
    }

    static void swap (int index1, int index2, int[] arr) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}