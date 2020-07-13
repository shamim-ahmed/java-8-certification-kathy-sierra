package edu.buet.cse.ch08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTrial3 {
  public static void main(String... args) {
    List<String> dogNames = Arrays.asList("Aiko", "Boi", "Clover");

    // example 1
    Consumer<String> printer = s -> System.out.println(s.toUpperCase());
    dogNames.forEach(printer);

    System.out.println();

    // example 2
    dogNames.forEach(s -> System.out.println(s.toUpperCase()));
  }
}
