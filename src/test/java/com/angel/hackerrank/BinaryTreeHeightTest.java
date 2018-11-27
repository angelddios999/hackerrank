package com.angel.hackerrank;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeHeightTest {

    @Test
    public void testBinaryTreeHeight() {
        Node tree = null;
        List<Integer> list = List.of(3, 5, 2, 1, 4, 6, 7);
        for (Integer e : list) {
            tree = Node.insert(tree, e);
        }
        assertEquals(3, BinaryTreeHeight.height(tree));
    }
}
