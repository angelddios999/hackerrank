package com.angel.hackerrank;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TwoStrings {
    static String twoStrings(String s1, String s2) {
        if(Objects.nonNull(s1) && Objects.nonNull(s2)) {
            Set<String> s1Map = new HashSet<>();
            s1.chars().forEach(c -> s1Map.add(String.valueOf(c)));
            Set<String> s2Map = new HashSet<>();
            s2.chars().forEach(c -> s2Map.add(String.valueOf(c)));
            if(Collections.disjoint(s1Map, s2Map)) {
                return "NO";
            } else {
                return "YES";
            }
        }
        return "NO";
    }
}