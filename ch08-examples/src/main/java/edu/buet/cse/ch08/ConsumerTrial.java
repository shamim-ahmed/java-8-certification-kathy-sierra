package edu.buet.cse.ch08;

import java.util.function.Consumer;

public class ConsumerTrial {
  public static void main(String... args) {
    Consumer<String> redOrBlue = pill -> {
      if ("red".equalsIgnoreCase(pill)) {
        System.out.println("Down the rabbit hole");
      } else if ("blue".equalsIgnoreCase(pill)) {
        System.out.println("Welcome to lala land");
      }
    };
    
    redOrBlue.accept("red");
  }
}
