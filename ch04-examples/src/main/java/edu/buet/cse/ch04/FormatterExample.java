package edu.buet.cse.ch04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatterExample {
  public static void main(String... args) {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    System.out.println(formatter.format(now));

    DateTimeFormatter formatter2 = DateTimeFormatter.ISO_DATE_TIME;
    System.out.println(now.format(formatter2));
  }
}
