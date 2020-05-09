package edu.buet.cse.ch08;

import edu.buet.cse.ch08.model.Dog;

/**
 * Demonstrate different possible syntaxes for lambda expressions
 * 
 * @author shamim
 */
public class DogQuerierTrial {
  private static final String DOG_NAME = "Boi";

  public static void main(String... args) {
    DogQuerier dq1 = (d) -> d.getAge() > 5;
    DogQuerier dq2 = (Dog d) -> d.getWeight() >= 10;
    DogQuerier dq3 = d -> {
      return d.getName().equals(DOG_NAME);
    };

    Dog dog = new Dog("Aiko", 7, 10);
    System.out.println(dq1.test(dog));
    System.out.println(dq2.test(dog));
    System.out.println(dq3.test(dog));
  }
}
