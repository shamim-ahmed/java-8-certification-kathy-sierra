package edu.buet.cse.ch08;

import java.util.function.Supplier;

public class SupplierTrial {
  public static void main(String... args) {
    Supplier<Integer> answerSupplier = () -> 42;
    System.out.println("Answer to everything: " + answerSupplier.get());
  }
}
