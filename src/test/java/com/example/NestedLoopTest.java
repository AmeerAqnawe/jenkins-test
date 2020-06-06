package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NestedLoopTest {

    @Test
    void nestedForLoops() {
        NestedLoop loop = new NestedLoop();
        assertEquals(56, loop.nestedForLoops());
    }
}
