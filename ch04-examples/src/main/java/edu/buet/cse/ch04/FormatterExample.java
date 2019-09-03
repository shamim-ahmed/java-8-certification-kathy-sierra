package edu.buet.cse.ch04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatterExample {
  public static void main(String... args) {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    System.out.println(formatter.format(now));
  }
}
