package com.example;

public class SimpleInteger {

  public int foo() {
    int a = 23;
    int b = 42;
    int c = a + b;
    b = 12;
    int d = b - c;
    return c * b / d;
  }
}
