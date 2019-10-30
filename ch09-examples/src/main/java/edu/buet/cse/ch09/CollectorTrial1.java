package edu.buet.cse.ch09;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Let's implement the count operation
 * 
 * @author shamim
 *
 */
public class CollectorTrial1 {
  public static void main(String... args) {
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    long count = stream.collect(Collectors.counting());

    System.out.println(count);
  }
}
