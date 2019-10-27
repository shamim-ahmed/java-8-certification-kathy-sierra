package edu.buet.cse.ch09;

import java.util.stream.Stream;

public class FilterStreamTrial1 {
  public static void main(String... args) {
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    long result1 = stream.filter(n -> n > 1).count();
    System.out.printf("Number of items > 1: %d%n", result1);

    stream = Stream.of(1, 2, 3, 4, 5);
    long result2 = stream.filter(n -> n > 3).count();
    System.out.printf("Number of items > 3: %d%n", result2);
  }
}
