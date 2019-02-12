package com.suray.demo;

import junit.framework.TestCase;

public class DemoTest extends TestCase {

    private static Demo demo = new Demo();

    public DemoTest(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testAdd() {
        demo.add(3);
        demo.add(4);
        assertEquals(7, demo.getResult());
    }

}
