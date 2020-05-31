package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit test for simple App.
 */
public class ComplexTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    void shouldAnswerWithTrue()
    {
        Complex calc = new Complex(1.0, 4.0);
        assertNotNull(calc);
    }
}
