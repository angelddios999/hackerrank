package com.angel.hackerrank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCATest {
    private int[] values = new int[]{2, 3, 1, 7, 6};
    private Node node = new Node(4);

    @Before
    public void setUp() {
        for(int value : values) {
            node.insert(value);
        }
    }

    @Test
    public void testLCA() {
        Node lca = LCA.lca(node, 1, 7);
        assertEquals(4, lca.getData());
    }
}
