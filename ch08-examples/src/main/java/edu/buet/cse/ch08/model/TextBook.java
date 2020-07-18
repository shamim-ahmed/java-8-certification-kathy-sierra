package edu.buet.cse.ch08.model;

import java.util.Objects;

public class TextBook extends Book {
  private final Integer year;
  
  public TextBook(String name, Double price, Integer year) {
    super(name, price);
    this.year = Objects.requireNonNull(year);
  }
  
  public Integer getYear() {
    return year;
  }
}
