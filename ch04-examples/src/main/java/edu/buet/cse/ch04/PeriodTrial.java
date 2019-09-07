package edu.buet.cse.ch04;

import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PeriodTrial {
  public static void main(String... args) {
    ZonedDateTime dateTime =
        ZonedDateTime.of(2019, 9, 7, 16, 25, 5, 0, ZoneId.of("Australia/Sydney"));
    System.out.printf("original: %s%n", dateTime);

    Period period1 = Period.ofMonths(5);
    ZonedDateTime result1 = dateTime.plus(period1);
    System.out.printf("result1: %s%n", result1);

    Period period2 = Period.ofYears(1);
    ZonedDateTime result2 = dateTime.minus(period2);
    System.out.printf("result2: %s%n", result2);

    Period period3 = Period.ofDays(16);
    ZonedDateTime result3 = dateTime.plus(period3);
    System.out.printf("result3: %s%n", result3);

    Period period4 = Period.of(1, 6, 15);
    ZonedDateTime result4 = dateTime.minus(period4);
    System.out.printf("result4: %s%n", result4);

    Period period5 = Period.ofWeeks(3);
    ZonedDateTime result5 = dateTime.plus(period5);
    System.out.printf("result5: %s%n", result5);
  }
}
