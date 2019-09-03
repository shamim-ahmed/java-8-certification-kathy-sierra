package edu.buet.cse.ch04;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

public class LocalTimeTrial {
  public static void main(String... args) {
    LocalTime time1 = LocalTime.of(23, 9, 15);
    System.out.println("LocalTime: " + time1);

    LocalTime time2 = LocalTime.parse("23:09:15");
    System.out.println("LocalTime: " + time2);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    LocalTime time3 = LocalTime.parse("23:09:15", formatter);
    System.out.println("LocalTime: " + time3);

    TemporalAccessor result = formatter.parse("23:09:15");
    int hour = result.get(ChronoField.HOUR_OF_DAY);
    int minute = result.get(ChronoField.MINUTE_OF_HOUR);
    int second = result.get(ChronoField.SECOND_OF_MINUTE);

    System.out.printf("Hour: %d, Minute: %d, Second: %d%n", hour, minute, second);
  }
}
