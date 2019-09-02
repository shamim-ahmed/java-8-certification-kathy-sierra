package edu.buet.cse.ch04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeTrial {
  public static void main(String... args) {
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();

    LocalDateTime dateTime1 = LocalDateTime.of(date, time);
    System.out.println("Current date and time is: " + dateTime1);

    LocalDateTime dateTime2 = LocalDateTime.now();
    System.out.println("Current date and time is: " + dateTime2);

    LocalDateTime dateTime3 = LocalDateTime.of(2019, 9, 2, 23, 5, 25, 0);
    System.out.println("LocalDateTime value: " + dateTime3);

    LocalDateTime dateTime4 = LocalDateTime.parse("2019-05-04T23:12:15");
    System.out.println("Parsed LocalDateTime: " + dateTime4);


  }
}
