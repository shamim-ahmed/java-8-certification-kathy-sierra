package edu.buet.cse.ocpjp;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapComputeTrial {
  public static void main(String... args) {
    Map<String, Integer> myMap = new HashMap<>();
    myMap.put("abc", 1);
    myMap.put("def", 2);
    myMap.putIfAbsent("ghi", 3);

    BiFunction<String, Integer, Integer> bf = (s, n) -> n * n;
    myMap.computeIfPresent("def", bf);
    myMap.computeIfAbsent("jkl", s -> 0);

    myMap.forEach((s, n) -> System.out.println("key = " + s + ", value = " + n));
  }
}
