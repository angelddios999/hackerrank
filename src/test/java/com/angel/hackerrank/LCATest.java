package com.angel.hackerrank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCATest {
    private int[] values = new int[]{4, 9, 1, 2, 3, 6, 5};
    private Node node = new Node(8);

    @Before
    public void setUp() {
        for(int value : values) {
            node.insert(value);
        }
    }

    @Test
    public void testLCA() {
        Node lca = LCA.lca(node, 1, 2);
        assertEquals(1, lca.getData());
    }
}
