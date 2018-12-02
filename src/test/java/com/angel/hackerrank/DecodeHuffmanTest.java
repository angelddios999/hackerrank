package com.angel.hackerrank;

import org.junit.Before;
import org.junit.Test;

public class DecodeHuffmanTest {
    private int[] values = new int[]{13, 5, 3, 6};
    private String decoded = "1001011";
    private Node node = new Node(10);

    @Before
    public void setUp() {
        for(int value : values) {
            node.insert(value);
        }
    }

    @Test
    public void testDecodeHuffman() {
        new DecodeHuffman().decode(decoded, node);
    }
}
