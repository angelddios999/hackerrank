package com.angel.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CheckBST {

    boolean checkBST(Node root) {
        List<Integer> values = new ArrayList<>();
        return checkNode(root, values);
    }

    private boolean checkNode(Node node, List<Integer> values) {
        boolean isBST = true;

        if(node != null) {
            if(values.contains(node.data)) {
                return false;
            }

            values.add(node.data);

            if(node.left != null) {
                if(node.left.data > node.data) {
                    return false;
                }
            }
            if(node.right != null) {
                if(node.right.data < node.data) {
                    return false;
                }
            }

            isBST = checkNode(node.left, values) && checkNode(node.right, values);
        }

        return isBST;
    }
}
