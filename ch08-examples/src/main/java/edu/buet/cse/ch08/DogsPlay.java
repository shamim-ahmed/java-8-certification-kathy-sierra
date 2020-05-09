package edu.buet.cse.ch08;

import edu.buet.cse.ch08.model.Dog;

/**
 * A wrapper for a DogQuerier instance
 * 
 * @author shamim
 */
public class DogsPlay {
  private final DogQuerier dogQuerier;

  public DogsPlay(DogQuerier dogQuerier) {
    this.dogQuerier = dogQuerier;
  }

  public boolean doQuery(Dog d) {
    return dogQuerier.test(d);
  }
}
