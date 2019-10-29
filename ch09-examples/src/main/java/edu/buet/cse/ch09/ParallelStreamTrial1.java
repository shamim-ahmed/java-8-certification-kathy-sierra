package edu.buet.cse.ch09;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamTrial1 {
  public static void main(String... args) {
    List<String> nameList = Arrays.asList("Alice", "Bob", "Cathy", "Diego", "Elane");

    nameList.stream().parallel().forEach(System.out::println);
  }
}
