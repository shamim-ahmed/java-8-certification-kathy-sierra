package edu.buet.cse.ocpjp;

import java.util.stream.IntStream;

public class IterateTrial2 {
  public static void main(String... args) {
    IntStream.iterate(0, i -> i + 1).parallel().limit(10).forEachOrdered(System.out::println);
  }
}
