package edu.buet.cse.ch09;

import java.util.ArrayList;
import java.util.List;

import edu.buet.cse.ch09.model.Dog;

public class DogTrial {
  public static void main(String... args) {
    Dog dog1 = new Dog("Aiko", 5, 20);
    Dog dog2 = new Dog("Bui", 2, 10);
    Dog dog3 = new Dog("Chihu", 8, 15);

    List<Dog> dogList = new ArrayList<>();
    dogList.add(dog1);
    dogList.add(dog2);
    dogList.add(dog3);

    dogList.stream().filter(d -> d.getAge() >= 5).forEach(d -> System.out.println(d.getName()));
  }
}
