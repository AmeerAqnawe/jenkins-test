package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleIntegerTest {

    @Test
    void foo() {
        SimpleInteger simple = new SimpleInteger();
        assertEquals(-14, simple.foo());
    }
}
