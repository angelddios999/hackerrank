package com.angel.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LCA {
    public static Node lca(Node root, int v1, int v2) {
        if(root.data == v1 || root.data == v2) {
            return root;
        }

        List<Node> ancestors = new ArrayList<>();
        populateAncestors(ancestors, root, v1);
        Collections.reverse(ancestors);

        for(Node node : ancestors) {
            if(contains(node, v2)) {
                return node;
            }
        }

        return null;
    }

    private static void populateAncestors(List<Node> ancestors, Node node, int value) {
        if(node.data == value) {
            ancestors.add(node);
            return;
        } else if(value < node.data) {
            if(node.left == null) {
                return;
            } else {
                ancestors.add(node);
                populateAncestors(ancestors, node.left, value);
            }
        } else {
            if(node.right == null) {
                return;
            } else {
                ancestors.add(node);
                populateAncestors(ancestors, node.right, value);
            }
        }
    }


    private static boolean contains(Node node, int value) {
        if(value == node.data) {
            return true;
        }
        if(value < node.data) {
            if(node.left == null) {
                return false;
            } else {
                return contains(node.left, value);
            }
        } else {
            if(node.right == null) {
                return false;
            } else {
                return contains(node.right, value);
            }
        }
    }
}
