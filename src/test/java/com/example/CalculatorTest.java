package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testEvaluate() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.evaluate("2+2"));
    }
}
