package com.example;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class RationalTest {

    @Test
    void testEquals() {
        Rational rational1 = Rational.of(3);
        Rational rational2 = Rational.of(3);
        assertEquals(rational2, rational1);
    }

    @Test
    void testOf() {
        BigInteger numerator = BigInteger.ONE;
        BigInteger denominator = BigInteger.ZERO;
        assertThrows(IllegalArgumentException.class, () -> Rational.of(numerator, denominator));
    }

    @Test
    void testToString() {
        BigInteger numerator = BigInteger.ONE;
        BigInteger denominator = BigInteger.ONE;
        Rational rat = Rational.of(numerator, denominator);
        assertEquals("1", rat.toString());
    }
}