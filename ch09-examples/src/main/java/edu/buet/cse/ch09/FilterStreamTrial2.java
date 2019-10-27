package edu.buet.cse.ch09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterStreamTrial2 {
  public static void main(String... args) {
    List<Double> tempReadingList =
        Arrays.asList(123.6, 118.0, 113.0, 112.5, 115.8, 117.0, 110.2, 106.0, 106.4, 108.0);

    long n = tempReadingList.stream().filter(t -> t > 110.0).count();
    System.out.printf("Number of days: %d%n", n);

    Stream<Double> stream = tempReadingList.stream();
    n = stream.filter(t -> t > 110.0).count();
    System.out.printf("Number of days: %d%n", n);
  }
}
