package edu.buet.cse.ch04;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeTrial {
  public static void main(String... args) {
    LocalDateTime localDateTime = LocalDateTime.now();
    ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("US/Eastern"));
    System.out.println(zonedDateTime);

    DateTimeFormatter formatter = DateTimeFormatter.ISO_ZONED_DATE_TIME;
    System.out.println(formatter.format(zonedDateTime));
  }
}
