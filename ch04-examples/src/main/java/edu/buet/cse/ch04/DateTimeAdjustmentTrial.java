package edu.buet.cse.ch04;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeAdjustmentTrial {
  public static void main(String... args) {
    LocalDateTime localDateTime = LocalDateTime.parse("2019-09-19T15:25:12");
    LocalDateTime result1 = localDateTime.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
    System.out.println(result1);

    LocalDateTime result2 = localDateTime.with(TemporalAdjusters.firstDayOfNextMonth());
    System.out.println(result2);

    LocalDateTime result3 = localDateTime.withDayOfMonth(29);
    System.out.println(result3);

    LocalDateTime result4 = localDateTime.with(TemporalAdjusters.firstDayOfNextYear());
    System.out.println(result4);
  }
}
