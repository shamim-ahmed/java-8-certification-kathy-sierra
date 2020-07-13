package edu.buet.cse.ch08;

import java.util.Map;
import java.util.function.BiConsumer;

public class ConsumerTrial2 {
  public static void main(String... args) {
    BiConsumer<String, String> printer = (name, value) -> {
      System.out.println(name + " = " + value);
    };

    Map<String, String> envMap = System.getenv();
    printer.accept("JAVA_HOME", envMap.get("JAVA_HOME"));
  }
}
