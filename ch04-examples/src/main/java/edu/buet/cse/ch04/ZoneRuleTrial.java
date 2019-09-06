package edu.buet.cse.ch04;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneRuleTrial {
  public static void main(String... args) {
    ZoneId sydneyZone = ZoneId.of("Australia/Sydney");

    // In Sydney, DST is not in effect on September 3
    LocalDateTime localDateTime1 = LocalDateTime.parse("2018-09-03T13:05:25");
    ZonedDateTime zonedDateTime1 = ZonedDateTime.of(localDateTime1, sydneyZone);
    System.out.println(sydneyZone.getRules().isDaylightSavings(zonedDateTime1.toInstant()));

    // In Sydney, DST is in effct on November 3
    LocalDateTime localDateTime2 = LocalDateTime.parse("2018-11-03T13:05:25");
    ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateTime2, sydneyZone);
    System.out.println(sydneyZone.getRules().isDaylightSavings(zonedDateTime2.toInstant()));
  }
}
