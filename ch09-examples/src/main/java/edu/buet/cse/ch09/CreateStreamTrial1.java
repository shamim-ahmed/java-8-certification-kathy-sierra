package edu.buet.cse.ch09;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Demonstrate various ways to create a stream
 * 
 * @author shamim
 *
 */
public class CreateStreamTrial1 {
  public static void main(String... args) {
    Integer[] values = {1, 2, 3};
    Stream<Integer> stream1 = Arrays.stream(values);
    stream1.forEach(System.out::println);
    System.out.println();

    Stream<Integer> stream2 = Stream.of(1, 2, 3);
    stream2.forEach(n -> System.out.println(n));
    System.out.println();

    Stream<Integer> stream3 = Stream.iterate(1, n -> n + 1).limit(3);
    stream3.forEach(System.out::println);
    System.out.println();

    Stream<Integer> stream4 = Stream.empty();
    long n = stream4.count();
    System.out.printf("Number of elements: %d%n", n);
    System.out.println();

    Stream<Integer> stream5 = Stream.of(values);
    stream5.forEach(System.out::println);
    System.out.println();

    Stream<Long> stream6 = Stream.iterate(1L, v -> v + 1).limit(3);
    stream6.forEach(System.out::println);
    System.out.println();
  }
}
