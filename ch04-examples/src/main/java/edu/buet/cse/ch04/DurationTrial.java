package edu.buet.cse.ch04;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTrial {
  public static void main(String... args) {
    LocalDateTime dateTime = LocalDateTime.parse("2019-09-07T16:14:28.678");
    System.out.printf("original: %s%n", dateTime);

    Duration duration1 = Duration.ofHours(5L);
    LocalDateTime result1 = dateTime.plus(duration1);
    System.out.printf("result1: %s%n", result1);

    Duration duration2 = Duration.ofMinutes(89L);
    LocalDateTime result2 = dateTime.minus(duration2);
    System.out.printf("result2: %s%n", result2);

    Duration duration3 = Duration.ofSeconds(120l);
    LocalDateTime result3 = dateTime.minus(duration3);
    System.out.printf("result3: %s%n", result3);

    Duration duration4 = Duration.ofMillis(5000);
    LocalDateTime result4 = dateTime.plus(duration4);
    System.out.printf("result4: %s%n", result4);

    Duration duration5 = Duration.of(6, ChronoUnit.MINUTES);
    LocalDateTime result5 = dateTime.plus(duration5);
    System.out.printf("result5: %s%n", result5);

    LocalTime time = LocalTime.parse("16:14:28.678");
    Duration duration6 = Duration.ofHours(15L);
    LocalTime result6 = time.plus(duration6);
    System.out.printf("result6: %s%n", result6);

    Duration duration7 = Duration.ofSeconds(27L, 675L);
    LocalTime result7 = time.minus(duration7);
    System.out.printf("result7: %s%n", result7);

    // print the string representation of a Duration object
    System.out.printf("Duration: %s%n", duration6);
  }
}
