package edu.buet.cse.ch08.model;

import java.util.Objects;

/**
 * A simple POJO
 * 
 * @author shamim
 */
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

  public void bark() {
    System.out.println("Woof Woof");
  }

  @Override
  public String toString() {
    return String.format("%s is %d years old", name, age);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Dog)) {
      return false;
    }

    Dog otherDog = (Dog) obj;

    return name.equals(otherDog.name) && age == otherDog.age && weight == otherDog.weight;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, weight);
  }
}
