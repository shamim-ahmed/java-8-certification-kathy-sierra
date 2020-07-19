package edu.buet.cse.ch09;

import edu.buet.cse.ch09.model.Dog;

@FunctionalInterface
public interface DogQuerier {
  boolean test(Dog dog);
}
