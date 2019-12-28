package edu.buet.cse.ocpjp;

import java.util.stream.Stream;

public class IterateTrial {
  public static void main(String... args) {
    Stream.iterate(0, i -> i + 1).parallel().limit(10).forEach(System.out::println);
  }
}
