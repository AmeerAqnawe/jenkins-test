package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @Test
    void testAdd() {
        Complex calc1 = new Complex(1.0, 4.0);
        Complex calc2 = new Complex(1.0, 4.0);
        Complex calc3 = calc1.add(calc2);
        assertEquals(2, calc3.real);
        assertEquals(8, calc3.imag);
    }

    @Test
    void testNegate() {
        Complex calc1 = new Complex(1.0, 4.0);
        Complex calc2 = calc1.negate();
        assertEquals(-1.0, calc2.real);
        assertEquals(-4.0, calc2.imag);
    }
}
