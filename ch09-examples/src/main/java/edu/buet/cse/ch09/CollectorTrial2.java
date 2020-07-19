package edu.buet.cse.ch09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import edu.buet.cse.ch09.model.Dog;

/**
 * Convert a list of Dog objects to a list of their names
 * 
 * @author shamim
 *
 */
public class CollectorTrial2 {
  public static void main(String... args) {
    Dog aiko = new Dog("Aiko", 5, 10);
    Dog billy = new Dog("Billy", 3, 8);
    Dog charlie = new Dog("Charlie", 8, 16);

    List<Dog> dogList = Arrays.asList(aiko, billy, charlie);
    // here we have no control over the actual type of the list
    List<String> nameList1 = dogList.stream().map(Dog::getName).collect(Collectors.toList());
    nameList1.forEach(System.out::println);
    System.out.println();

    // note the type of the list
    ArrayList<String> nameList2 =
        dogList.stream().map(Dog::getName).collect(Collectors.toCollection(ArrayList::new));
    nameList2.forEach(System.out::println);
  }
}
