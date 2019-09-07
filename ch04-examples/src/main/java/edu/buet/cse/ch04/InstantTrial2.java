package edu.buet.cse.ch04;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantTrial2 {
  public static void main(String... args) {
    ZonedDateTime dhakaTime1 = ZonedDateTime.parse("2017-11-04T13:05:17+06:00");
    ZonedDateTime sydneyTime1 = dhakaTime1.withZoneSameInstant(ZoneId.of("Australia/Sydney"));
    System.out.printf("Dhaka time: %s, Sydney time: %s%n", dhakaTime1, sydneyTime1);

    Duration duration = Duration.ofHours(2L);
    ZonedDateTime dhakaTime2 = dhakaTime1.plus(duration);
    ZonedDateTime sydneyTime2 = sydneyTime1.plus(duration);
    System.out.printf("Dhaka time: %s, Sydney time: %s%n", dhakaTime2, sydneyTime2);
  }
}
