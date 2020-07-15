package edu.buet.cse.ch08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import edu.buet.cse.ch08.model.Dog;

public class PredicateTrial3 {
  public static void main(String... args) {
    Dog aiko = new Dog("Aiko", 5, 10);
    Dog clover = new Dog("Clover", 6, 12);
    Dog zooey = new Dog("Zooey", 7, 14);
    List<Dog> dogList = Arrays.asList(aiko, clover, zooey);

    // use a static method to create a predicate
    Predicate<Dog> zooeyPredicate = Predicate.isEqual(new Dog("Zooey", 7, 14));

    // use the predicate to filter a list
    dogList.stream().filter(zooeyPredicate).forEach(System.out::println);
  }
}
