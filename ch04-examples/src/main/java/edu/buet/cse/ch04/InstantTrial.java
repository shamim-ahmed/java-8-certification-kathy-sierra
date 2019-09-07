package edu.buet.cse.ch04;

import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class InstantTrial {
  public static void main(String... args) {
    ZonedDateTime dateTime1 = ZonedDateTime.parse("2017-05-04T13:05:17+10:00");
    Instant instant1 = dateTime1.toInstant();

    ZonedDateTime dateTime2 = ZonedDateTime.parse("2017-09-04T13:05:17+06:00");
    Instant instant2 = dateTime2.toInstant();

    long minutes = ChronoUnit.MINUTES.between(instant1, instant2);
    Duration duration = Duration.ofMinutes(minutes);
    System.out.println(duration);

    Instant now = Instant.now();
    System.out.printf("Epoch Second: %d%n", now.getEpochSecond());
  }
}
