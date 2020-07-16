package edu.buet.cse.ch08;

import java.util.function.Function;

public class FunctionTrial {
  public static void main(String... args) {
    Function<Integer, String> answerFunction = n -> {
      if (n == 42) {
        return "forty-two";
      } else {
        return "No answer for you!";
      }
    };

    System.out.println(answerFunction.apply(42));
    System.out.println(answerFunction.apply(43));
  }
}
