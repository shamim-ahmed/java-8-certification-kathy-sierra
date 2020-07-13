package edu.buet.cse.ch08;

import java.util.Map;
import java.util.function.BiConsumer;

public class ConsumerTrial4 {
  public static void main(String... args) {
    Map<String, String> envMap = System.getenv();

    // example 1
    BiConsumer<String, String> printer = (key, value) -> System.out.println(key + " = " + value);
    envMap.forEach(printer);

    System.out.println();

    // example 2
    envMap.forEach((k, v) -> System.out.println(k + " = " + v));
  }
}
