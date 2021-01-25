package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

    @Test
    void testGCD() {
        GCD gcd = new GCD();
        assertEquals(2, gcd.gcd(4, 6));
    }
}
