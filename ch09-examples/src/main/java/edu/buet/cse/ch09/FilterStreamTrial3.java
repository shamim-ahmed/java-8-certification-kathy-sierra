package edu.buet.cse.ch09;

import java.util.HashMap;
import java.util.Map;

public class FilterStreamTrial3 {
  public static void main(String... args) {
    Map<String, Integer> myMap = new HashMap<>();
    myMap.put("Aiko", 8);
    myMap.put("Boi", 6);
    myMap.put("Chris", 10);

    myMap.entrySet().stream().filter(e -> e.getValue() > 7)
        .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
  }
}
