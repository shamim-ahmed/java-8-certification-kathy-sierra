package edu.buet.cse.ch08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import edu.buet.cse.ch08.model.Dog;

public class ConsumerChainingTrial2 {
  public static void main(String... args) {
    Dog aiko = new Dog("Aiko", 5, 10);
    Dog clover = new Dog("Clover", 6, 12);
    Dog zooey = new Dog("Zooey", 7, 14);
    List<Dog> dogList = Arrays.asList(aiko, clover, zooey);

    // declare two consumers
    Consumer<Dog> namePrinter = d -> System.out.println(d.getName());
    Consumer<Dog> triggerBark = d -> d.bark();
    
    // chain the consumers to create a new consumer
    Consumer<Dog> chainedConsumer = namePrinter.andThen(triggerBark);

    dogList.forEach(chainedConsumer);
  }
}
