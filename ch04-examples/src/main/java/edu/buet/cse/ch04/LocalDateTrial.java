package edu.buet.cse.ch04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

public class LocalDateTrial {
  public static void main(String... args) {
    LocalDate date1 = LocalDate.of(2019, 9, 3);
    System.out.println("LocalDate: " + date1);

    LocalDate date2 = LocalDate.parse("2019-09-03");
    System.out.println("LocalDate: " + date2);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate date3 = LocalDate.parse("2019-09-03", formatter);
    System.out.println("LocalDate: " + date3);

    TemporalAccessor result = formatter.parse("2019-09-03");
    int year = result.get(ChronoField.YEAR);
    int month = result.get(ChronoField.MONTH_OF_YEAR);
    int day = result.get(ChronoField.DAY_OF_MONTH);

    System.out.printf("year: %d, month: %d, day: %d%n", year, month, day);
  }
}
