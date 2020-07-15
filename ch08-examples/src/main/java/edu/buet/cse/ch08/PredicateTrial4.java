package edu.buet.cse.ch08;

import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class PredicateTrial4 {
  private static final int MAX = 100;

  public static void main(String... args) {
    Random randomGenerator = new Random();
    IntSupplier valueSupplier = () -> randomGenerator.nextInt(MAX);
    IntPredicate evenPredicate = i -> i % 2 == 0;

    for (int i = 0; i < 10; i++) {
      int n = valueSupplier.getAsInt();

      if (evenPredicate.test(n)) {
        System.out.println(n);
      }
    }
  }
}
