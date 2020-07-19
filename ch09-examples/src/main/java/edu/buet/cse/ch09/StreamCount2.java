package edu.buet.cse.ch09;

import java.util.stream.Stream;

public class StreamCount2 {
  public static void main(String... args) {
    Stream<Integer> valueStream = Stream.of(1, 2, 3, 4, 5);
    int count = valueStream.mapToInt(n -> 1).sum();
    System.out.println("Number of items in stream = " + count);
  }
}
