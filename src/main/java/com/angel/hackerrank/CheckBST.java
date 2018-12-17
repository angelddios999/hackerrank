package com.angel.hackerrank;

public class CheckBST {

    boolean checkBST(Node root) {
        return checkNode(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean checkNode(Node node, int min, int max) {
        if(node == null) {
            return true;
        }

        return min < node.data && node.data < max
                && checkNode(node.left, min, node.data)
                && checkNode(node.right, node.data, max);
    }
}
