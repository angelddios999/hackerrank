package com.angel.hackerrank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeHeightTest {
    private int[] values = new int[]{5, 2, 1, 4, 6, 7};
    private Node node = new Node(3);

    @Before
    public void setUp(){
        for(int value : values) {
            node.insert(value);
        }
    }

    @Test
    public void testBinaryTreeHeight() {
        assertEquals(3, BinaryTreeHeight.height(node));
    }
}
