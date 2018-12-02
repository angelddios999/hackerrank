package com.angel.hackerrank;

import java.util.*;

public class MakeAnagram {
    static int makeAnagram(String a, String b) {
        Map<Character, Integer> characterMap = getCharacterMap(a);
        return countDifferences(characterMap, b);
    }

    static Map<Character, Integer> getCharacterMap(String string) {
        Map<Character, Integer> characterMap = new HashMap<>();
        if(Objects.nonNull(string)) {
            for(char c : string.toCharArray()) {
                Character character = Character.valueOf(c);
                characterMap.computeIfPresent(character, (k,v) -> v + 1);
                characterMap.computeIfAbsent(character, k -> 1);
            }
        }

        return characterMap;
    }

    static int countDifferences(Map<Character, Integer> characterMap, String string) {
        int differences = 0;
        for(char c : string.toCharArray()) {
            Character character = Character.valueOf(c);
            Integer value = characterMap.get(character);
            if(value == null) {
                differences++;
            } else {
                characterMap.put(character, value - 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : characterMap.entrySet()) {
            differences += Math.abs(entry.getValue());
        }

        return differences;
    }
}
