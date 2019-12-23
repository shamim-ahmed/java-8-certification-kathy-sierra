package edu.buet.cse.ocpjp;

import java.util.Arrays;
import java.util.List;

public class ListReplaceTrial {
  public static void main(String... args) {
    List<Integer> valueList = Arrays.asList(1, 2, 3, 4, 5);
    valueList.replaceAll(n -> n * n);

    valueList.forEach(System.out::println);
  }
}
