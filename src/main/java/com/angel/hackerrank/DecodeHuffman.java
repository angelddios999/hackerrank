package com.angel.hackerrank;

import java.util.LinkedList;
import java.util.Queue;

public class DecodeHuffman {
    void decode(String s, Node root) {
        if(s != null && root != null) {
            StringBuilder builder = new StringBuilder();
            Queue<Integer> numbers = new LinkedList<>();
            for(char c : s.toCharArray()) {
                numbers.add(Integer.valueOf(String.valueOf(c)));
            }
            searchLetters(root, root, numbers, builder);
        }
    }

    private void searchLetters(Node root, Node node, Queue<Integer> numbers, StringBuilder builder) {
        if(numbers.isEmpty()) {
            builder.append(node.data);
            System.out.println(builder.toString());
        } else{
            if(node.left == null && node.right == null) {
                builder.append(node.data);
                searchLetters(root, root, numbers, builder);
            } else {
                int nextValue = numbers.poll();
                if(nextValue == 0) {
                    searchLetters(root, node.left, numbers, builder);
                } else if(nextValue == 1){
                    searchLetters(root, node.right, numbers, builder);
                }
            }
        }
    }
}
