package edu.buet.cse.ocpjp;

import java.util.function.IntFunction;

public class IntFunctionTrial {
  public static void main(String... args) {
    MyFunction f = new MyFunction();
    System.out.println(f.apply(255));
  }

  static class MyFunction implements IntFunction<String> {
    public String apply(int n) {
      return Integer.toString(n, 16);
    }
  }
}

