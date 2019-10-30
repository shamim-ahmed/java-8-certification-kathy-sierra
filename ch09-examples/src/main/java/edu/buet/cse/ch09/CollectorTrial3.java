package edu.buet.cse.ch09;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Example on partitioning a given collection based on a specific criteria
 * 
 * @author shamim
 *
 */
public class CollectorTrial3 {
  public static void main(String... args) {
    Dog aiko = new Dog("Aiko", 5, 16);
    Dog billy = new Dog("Billy", 3, 8);
    Dog charlie = new Dog("Charlie", 8, 12);
    Dog haku = new Dog("Haku", 7, 9);

    List<Dog> dogList = Arrays.asList(aiko, billy, charlie, haku);

    Map<Boolean, List<Dog>> partitionByAge =
        dogList.stream().collect(Collectors.partitioningBy(d -> d.getAge() <= 5));
    partitionByAge.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    System.out.println();

    Map<Boolean, List<Dog>> partitionByWeight =
        dogList.stream().collect(Collectors.partitioningBy(d -> d.getWeight() <= 10));
    partitionByWeight.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
  }
}
