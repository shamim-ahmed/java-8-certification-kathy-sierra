package edu.buet.cse.ch08;

import java.util.function.Function;

public class FunctionTrial4 {
  public static void main(String... args) {
    String name = "Vanessa Williams";

    // identity function
    Function<String, String> conversionFunction = Function.identity();
    System.out.println(conversionFunction.apply(name));

    // function to convert name to upper case
    Function<String, String> upperCaseFunction = s -> s.toUpperCase();
    System.out.println(upperCaseFunction.apply(name));
  }
}
