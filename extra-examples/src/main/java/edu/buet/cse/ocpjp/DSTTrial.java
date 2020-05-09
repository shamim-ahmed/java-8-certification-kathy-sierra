package edu.buet.cse.ocpjp;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DSTTrial {
  public static void main(String... args) {
    LocalDateTime ldt = LocalDateTime.of(2017, 6, 2, 6, 0, 0);
    ZoneOffset offset = ZoneOffset.ofHoursMinutes(-5, 0);
    ZoneId zoneId = ZoneId.of("America/New_York");
    
    OffsetDateTime dateTime1 = ldt.atOffset(offset);
    ZonedDateTime dateTime2 = ldt.atZone(zoneId);
    Duration diff = Duration.between(dateTime1, dateTime2);
    System.out.println(diff);
  }
}
