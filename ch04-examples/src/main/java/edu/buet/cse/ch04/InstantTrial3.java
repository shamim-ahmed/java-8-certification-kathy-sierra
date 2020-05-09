package edu.buet.cse.ch04;

import java.time.Instant;

public class InstantTrial3 {
  public static void main(String...args) {
    Instant instant = Instant.parse("2019-12-30T17:25:36z");
    System.out.println(instant);
  }
}
