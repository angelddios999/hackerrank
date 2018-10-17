package com.angel.hackerrank;

import java.util.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        if (Objects.nonNull(ar)) {
            Map<Integer, Integer> colorsMap = new HashMap<>();
            Arrays.stream(ar).boxed().forEach(color -> {
                colorsMap.computeIfAbsent(color, k -> Integer.valueOf(0));
                colorsMap.computeIfPresent(color, (k, v) -> v + 1);
            });
            result = colorsMap.values().stream().reduce(Integer.valueOf(0), SockMerchant::divide);
        }

        return result;
    }

    private static Integer divide(Integer sum, Integer number) {
        return Integer.sum(sum, Integer.divideUnsigned(number, 2));
    }
}

