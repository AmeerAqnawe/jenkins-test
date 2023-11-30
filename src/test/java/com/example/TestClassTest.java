package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClassTest {

    @Test
    void countCharacters() {
        TestClass testClass = new TestClass();
        assertEquals(3, testClass.countCharacters());
    }

    @Test
    void removeSpaces() {
        TestClass test = new TestClass();
        assertEquals("HelloWorld!", test.removeSpaces("Hello World!"));
    }

    @Test
    void coverLine21() {
        TestClass test = new TestClass();
        test.countFoos(6);
    }
}