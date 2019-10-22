package edu.buet.cse.ch09;

import java.util.ArrayList;
import java.util.List;

public class DogTrial3 {
  public static void main(String... args) {
    Dog dog1 = new Dog("Aiko", 5, 20);
    Dog dog2 = new Dog("Bui", 2, 10);
    Dog dog3 = new Dog("Chihu", 8, 15);

    List<Dog> dogList = new ArrayList<>();
    dogList.add(dog1);
    dogList.add(dog2);
    dogList.add(dog3);

    DogQuerier querier = (Dog d) -> {
      return d.getAge() >= 5;
    };

    System.out.printf("is Aiko's age >= 5 ? %b%n", querier.test(dog1));
    System.out.printf("Is Bui's age >= 5 ? %b%n", querier.test(dog2));
  }
}
