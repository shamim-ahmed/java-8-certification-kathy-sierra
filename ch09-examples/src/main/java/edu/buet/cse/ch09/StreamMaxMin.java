package edu.buet.cse.ch09;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMaxMin {
  public static void main(String... args) {
    // create a stream
    Stream<Integer> valueStream = generateStream();

    // note that max is a terminal operation
    Optional<Integer> optionalMax = valueStream.max(Comparator.comparing(Integer::intValue));
    optionalMax.ifPresent(System.out::println);

    // create a stream again
    valueStream = generateStream();

    // note that min is a terminal operation
    Optional<Integer> optionalMin = valueStream.min(Comparator.comparing(Integer::intValue));
    optionalMin.ifPresentOrElse(System.out::println, () -> {
      System.out.println("No min value found");
    });
  }

  private static Stream<Integer> generateStream() {
    return Stream.iterate(0, n -> n + 1).limit(5);
  }
}
