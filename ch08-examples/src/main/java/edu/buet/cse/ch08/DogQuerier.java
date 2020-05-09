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
}
