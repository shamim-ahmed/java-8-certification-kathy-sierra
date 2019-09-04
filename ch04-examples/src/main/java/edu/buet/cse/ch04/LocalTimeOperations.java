package edu.buet.cse.ch04;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public final class LocalTimeOperations {
  public static void main(String... args) {
    LocalTime time = LocalTime.of(23, 5, 45);
    System.out.println(time.format(DateTimeFormatter.ISO_TIME));

    LocalTime result1 = time.plusHours(2);
    System.out.println(result1);

    LocalTime result2 = time.minusMinutes(10);
    System.out.println(DateTimeFormatter.ISO_TIME.format(result2));

    LocalTime result3 = time.minus(Duration.ofHours(2));
    System.out.println(result3);
  }
}
