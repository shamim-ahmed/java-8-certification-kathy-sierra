package edu.buet.cse.ch08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import edu.buet.cse.ch08.model.Dog;

public class PredicateTrial2 {
  public static void main(String... args) {
    Dog aiko = new Dog("Aiko", 5, 10);
    Dog clover = new Dog("Clover", 6, 12);
    Dog zooey = new Dog("Zooey", 7, 14);
    List<Dog> dogList = Arrays.asList(aiko, clover, zooey);

    // declare two predicates
    Predicate<Dog> agePredicate = d -> d.getAge() <= 6;
    Predicate<Dog> namePredicate = d -> d.getName().startsWith("A");

    // use default method to formulate a new predicate that performs AND operation
    dogList.stream().filter(agePredicate.and(namePredicate)).forEach(d -> System.out.println(d));
  }
}
