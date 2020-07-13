package edu.buet.cse.ch08;

import java.util.Map;
import java.util.function.Supplier;

public class SupplierTrial2 {
  public static void main(String... args) {
    Supplier<String> userSupplier = () -> {
      Map<String, String> envMap = System.getenv();
      System.out.println(envMap);
      return envMap.get("USER");
    };

    System.out.println("The user is: " + userSupplier.get());
  }
}
