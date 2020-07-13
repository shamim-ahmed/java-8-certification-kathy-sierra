package edu.buet.cse.ch08;

import java.util.Random;
import java.util.function.IntSupplier;

public class SupplierTrial3 {
  public static void main(String... args) {
    Random randomGenerator = new Random();
    IntSupplier valueSupplier = () -> randomGenerator.nextInt(50);

    System.out.println("The value is: " + valueSupplier.getAsInt());
  }
}
