package edu.buet.cse.ch08;

import edu.buet.cse.ch08.model.Dog;

/**
 * An example to demonstrate variable scopes in the context of lambda
 * 
 * @author shamim
 */
public class DogQuerierTrial3 {
  public static void main(String... args) {
    int numOfCats = 2;

    DogQuerier dq = dog -> {
      // you can modify a variable defined within lambda
      int numOfBalls = 5;
      numOfBalls++;
      System.out.println("number of balls " + numOfBalls);

      // you can only access numOfCats, but cannot modify it
      System.out.println("number of cats " + numOfCats);

      return dog.getAge() > 5;
    };

    // there is no name clash here
    Dog dog = new Dog("aiko", 7, 10);

    // we are passing the captured numOfCats variable along with the lambda
    DogsPlay play = new DogsPlay(dq);
    System.out.println(play.doQuery(dog));
  }
}
