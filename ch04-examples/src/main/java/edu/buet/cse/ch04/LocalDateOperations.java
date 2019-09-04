package edu.buet.cse.ch04;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateOperations {
  public static void main(String... args) {
    LocalDate date = LocalDate.of(2019, 9, 5);

    LocalDate result1 = date.plusDays(2);
    System.out.println(result1);

    LocalDate result2 = date.minusMonths(2);
    System.out.println(result2.format(DateTimeFormatter.ISO_DATE));

    LocalDate result3 = date.minus(Period.ofMonths(2));
    System.out.println(DateTimeFormatter.ISO_DATE.format(result3));

    // the following line will cause an exception
    try {
      LocalDate result4 = date.plus(Duration.ofDays(2));
      System.out.println(result4);
    } catch (Exception e) {
      e.printStackTrace();
    }

    DayOfWeek dayOfWeek = date.getDayOfWeek();
    System.out.println(dayOfWeek);

    int dayOfMonth = date.getDayOfMonth();
    System.out.println(dayOfMonth);

    int dayOfYear = date.getDayOfYear();
    System.out.println(dayOfYear);
  }
}
