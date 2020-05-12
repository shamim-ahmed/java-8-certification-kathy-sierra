package edu.buet.cse.ch08;

import edu.buet.cse.ch08.model.Dog;

/**
 * A simple functional interface to test Dog instances
 * 
 * @author shamim
 */
@FunctionalInterface
public interface DogQuerier {
  boolean test(Dog d);

  // a functional interface can have default methods
  default void printName(Dog d) {
    System.out.println(d.getName());
  }

  // a functional interface can have static methods
  static void printWeight(Dog d) {
    System.out.println(d.getWeight());
  }
}
