package edu.buet.cse.ch08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import edu.buet.cse.ch08.model.Dog;

public class PredicateTrial {
  public static void main(String... args) {
    Dog aiko = new Dog("Aiko", 5, 10);
    Dog clover = new Dog("Clover", 6, 12);
    Dog zooey = new Dog("Zooey", 7, 14);
    List<Dog> dogList = Arrays.asList(aiko, clover, zooey);

    // define a predicate
    Predicate<Dog> agePredicate = d -> d.getAge() > 6;

    // use default method to negate the predicate and filter the list using the resulting predicate
    dogList.stream().filter(agePredicate.negate()).forEach(d -> System.out.println(d));
  }
}
