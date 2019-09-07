package edu.buet.cse.ch04;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DurationTrial {
  public static void main(String... args) {
    LocalDateTime dateTime = LocalDateTime.parse("2019-09-07T16:14:28.678");
    System.out.printf("original: %s%n", dateTime);

    Duration duration1 = Duration.ofHours(5);
    LocalDateTime result1 = dateTime.plus(duration1);
    System.out.printf("result1: %s%n", result1);

    Duration duration2 = Duration.ofMinutes(89);
    LocalDateTime result2 = dateTime.minus(duration2);
    System.out.printf("result2: %s%n", result2);

    Duration duration3 = Duration.ofSeconds(120);
    LocalDateTime result3 = dateTime.minus(duration3);
    System.out.printf("result3: %s%n", result3);

    Duration duration4 = Duration.ofMillis(5000);
    LocalDateTime result4 = dateTime.plus(duration4);
    System.out.printf("result4: %s%n", result4);

    Duration duration5 = Duration.of(6, ChronoUnit.MINUTES);
    LocalDateTime result5 = dateTime.plus(duration5);
    System.out.printf("result5: %s%n", result5);
  }
}
