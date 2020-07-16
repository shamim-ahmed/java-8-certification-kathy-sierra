package edu.buet.cse.ch08;

import java.util.HashMap;
import java.util.Map;

public class FunctionTrial3 {
  public static void main(String... args) {
    Map<String, String> aprilWinner = new HashMap<String, String>();
    aprilWinner.put("April 2015", "Lamer");
    aprilWinner.put("April 2016", "Annette");
    aprilWinner.put("April 2017", "Bob");

    // print map entries
    aprilWinner.forEach((k, v) -> System.out.println(k + " = " + v));
    System.out.println();

    // this entry will be added to map
    aprilWinner.computeIfAbsent("April 2014", key -> "John Doe");

    // this entry will not be added to map
    aprilWinner.computeIfAbsent("April 2014", key -> "Jane Doe");

    // print map contents again
    aprilWinner.forEach((k, v) -> System.out.println(k + " = " + v));
  }
}
