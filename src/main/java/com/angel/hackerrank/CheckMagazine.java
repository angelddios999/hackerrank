package com.angel.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CheckMagazine {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        List<String> magazineWords = Arrays.asList(magazine);
        Collections.sort(magazineWords);
        Queue<String> magazineWordsQueue = new LinkedList<>(magazineWords);
        List<String> noteWords = Arrays.asList(note);
        Collections.sort(noteWords);
        
        boolean notMatched = false;

        for (String noteWord : noteWords) {
            if (notMatched) {
                break;
            }
            while(!notMatched) {
                if (magazineWordsQueue.isEmpty()) {
                    notMatched = true;
                    break;
                }
                int comparison = noteWord.compareTo(magazineWordsQueue.peek());
                if(comparison == 0) {
                    magazineWordsQueue.remove();
                    break;
                } else if(comparison < 0) {
                    notMatched = true;
                    break;
                } else {
                    magazineWordsQueue.remove();
                }
            }
        }

        if (notMatched) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}