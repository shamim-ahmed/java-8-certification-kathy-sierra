package edu.buet.cse.ch09;

public class Dog {
  private final String name;
  private final int age;
  private final int weight;

  public Dog(String name, int age, int weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getWeight() {
    return weight;
  }
}
