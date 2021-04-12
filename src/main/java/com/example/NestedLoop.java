package com.example;

public class NestedLoop {

  public int loop() {
    int result = 0;
    for (int i = 0; i < 42; i++) {
      result += i;
    }
    return result;
  }
}
