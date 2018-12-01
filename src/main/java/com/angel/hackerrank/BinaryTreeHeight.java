package com.angel.hackerrank;

public class BinaryTreeHeight {

    public static int height(Node root) {
        if(root != null) {
            int leftHeight = height(root.getLeft(), 0);
            int rightHeight = height(root.getRight(), 0);

            return leftHeight > rightHeight ? leftHeight : rightHeight;
        }

        return 0;
    }

    private static int height(Node root, int currentHeight) {
        if (root == null) {
            return currentHeight;
        } else {
            int leftHeight = height(root.getLeft(), currentHeight + 1);
            int rightHeight = height(root.getRight(), currentHeight + 1);

            return leftHeight > rightHeight ? leftHeight : rightHeight;
        }
    }
}