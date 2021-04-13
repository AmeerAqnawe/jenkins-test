package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NestedLoopTest {

    @Test
    void loop() {
        NestedLoop loop = new NestedLoop();
        assertEquals(861, loop.loop());
    }
}
