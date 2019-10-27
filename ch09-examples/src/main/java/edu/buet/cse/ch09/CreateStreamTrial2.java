package edu.buet.cse.ch09;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Demonstrate various ways to create primitive streams
 * 
 * @author shamim
 *
 */
public class CreateStreamTrial2 {
  public static void main(String... args) {
    int[] intValues = {1, 2, 3};
    long[] longValues = {1L, 2L, 3L};
    double[] doubleValues = {1.0, 2.0, 3.0};

    // we cannot use Stream.of() here. That will create a stream of arrays ! Think why.
    IntStream stream1 = Arrays.stream(intValues);
    stream1.forEach(System.out::println);
    System.out.println();

    LongStream stream2 = Arrays.stream(longValues);
    stream2.forEach(System.out::println);
    System.out.println();

    DoubleStream stream3 = Arrays.stream(doubleValues);
    stream3.forEach(System.out::println);
  }
}
