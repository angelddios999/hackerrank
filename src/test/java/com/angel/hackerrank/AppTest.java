package com.angel.hackerrank;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void testSayHello() {
        App app = new App();
        assertTrue("Hello World!".equals(app.sayHello()));
    }
}
