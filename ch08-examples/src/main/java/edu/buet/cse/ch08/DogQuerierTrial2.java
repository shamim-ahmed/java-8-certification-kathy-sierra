package edu.buet.cse.ch08;

import edu.buet.cse.ch08.model.Dog;

/**
 * Demonstrate how a lambda expression can be passed as an argument
 * 
 * @author shamim
 */
public class DogQuerierTrial2 {
  public static void main(String... args) {
    DogsPlay play = new DogsPlay(d -> d.getAge() > 9);

    // note the variable name. There is no name collision here
    Dog d = new Dog("Aiko", 7, 10);
    System.out.println(play.doQuery(d));
  }
}
