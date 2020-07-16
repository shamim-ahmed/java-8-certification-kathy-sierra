package edu.buet.cse.ch08;

import java.util.function.BiFunction;

public class BiFunctionTrial {
  public static void main(String... args) {
    BiFunction<String, String, String> nameFormatter =
        (firstName, lastName) -> firstName + " " + lastName;

    System.out.println(nameFormatter.apply("John", "Smith"));
  }
}
