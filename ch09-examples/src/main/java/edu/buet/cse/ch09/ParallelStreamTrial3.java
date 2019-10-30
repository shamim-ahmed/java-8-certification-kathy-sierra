package edu.buet.cse.ch09;

import java.util.stream.IntStream;

public class ParallelStreamTrial3 {
  public static void main(String... args) {
    IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    // for IntStream, summation is easy
    int sum = stream.parallel().sum();
    System.out.println(sum);
  }
}
