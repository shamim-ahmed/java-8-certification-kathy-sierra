package edu.buet.cse.ch09;

import java.util.Objects;

public class Person {
  private final String name;
  private final Integer age;

  public Person(String name, Integer age) {
    this.name = name;
    this.age = Objects.requireNonNull(age);
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  @Override
  public String toString() {
    return String.format("%s is %d years old", name, age.intValue());
  }
}
