package com.angel.hackerrank;

import org.junit.Before;
import org.junit.Test;

public class NodeTest {
    private int[] values = new int[]{5, 2, 1, 4, 6, 7};
    private Node node = new Node(3);

    @Before
    public void setUp(){
        for(int value : values) {
            node.insert(value);
        }
    }

    @Test
    public void testInOrder(){
        node.printInOrder();
    }

    @Test
    public void testPreOrder(){
        node.printPreOrder();
    }

    @Test
    public void testPostOrder(){
        node.printPostOrder();
    }
}
