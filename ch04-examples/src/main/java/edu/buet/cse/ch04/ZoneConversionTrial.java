package edu.buet.cse.ch04;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneConversionTrial {
  public static void main(String... args) {
    LocalDateTime localDateTime = LocalDateTime.now();

    // Time in Sydney, AU
    ZoneId sydneyZone = ZoneId.of("Australia/Sydney");
    ZonedDateTime sydneyTime = ZonedDateTime.of(localDateTime, sydneyZone);
    System.out.printf("Sydney time: %s%n", sydneyTime);

    // Time in Istanbul
    ZonedDateTime istanbulTime = sydneyTime.withZoneSameInstant(ZoneId.of("Europe/Istanbul"));
    System.out.printf("Istanbul time: %s%n", istanbulTime);

    // Time in Dhaka
    ZonedDateTime dhakaTime = istanbulTime.withZoneSameInstant(ZoneId.of("Asia/Dhaka"));
    System.out.printf("Dhaka time: %s%n", dhakaTime);

    // convert a ZonedDateTime to LocalDateTime
    LocalDateTime localDateTime2 = dhakaTime.toLocalDateTime();
    System.out.printf("Local date/time: %s%n", localDateTime2);
  }
}
