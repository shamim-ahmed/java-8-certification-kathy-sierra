package edu.buet.cse.ch09;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Demonstrate an alternative way to create primitive streams
 * 
 * @author shamim
 *
 */
public class CreateStreamTrial4 {
  public static void main(String... args) {
    IntStream stream1 = IntStream.of(1, 2, 3);
    stream1.forEach(System.out::println);
    System.out.println();

    IntStream stream2 = IntStream.iterate(1, n -> n + 1).limit(3);
    stream2.forEach(System.out::println);
    System.out.println();

    // note that int values are automatically converted to long
    LongStream stream3 = LongStream.of(1, 2, 3);
    stream3.forEach(System.out::println);
    System.out.println();

    LongStream stream4 = LongStream.iterate(1L, v -> v + 1).limit(3);
    stream4.forEach(System.out::println);
    System.out.println();

    // note that int values are automatically converted to double
    DoubleStream stream5 = DoubleStream.of(1, 2, 3);
    stream5.forEach(System.out::println);
    System.out.println();
  }
}
