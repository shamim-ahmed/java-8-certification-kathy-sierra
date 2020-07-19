package edu.buet.cse.ch09;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCount {
  public static void main(String... args) {
    Integer[] values = {1, 2, 3};
    Stream<Integer> valueStream = Arrays.stream(values);

    // note that count is a terminal operation
    System.out.println("Number of items in the stream = " + valueStream.count());
  }
}
