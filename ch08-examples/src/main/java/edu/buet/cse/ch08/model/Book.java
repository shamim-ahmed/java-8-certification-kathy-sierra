package edu.buet.cse.ch08.model;

import java.util.Objects;

public class Book {
  private final String name;
  private final Double price;

  public Book(String name, Double price) {
    this.name = Objects.requireNonNull(name);
    this.price = Objects.requireNonNull(price);
  }

  public String getName() {
    return name;
  }

  public Double getPrice() {
    return price;
  }
  
  @Override
  public String toString() {
    return String.format("%s = %.2f", name, price);
  }
}
