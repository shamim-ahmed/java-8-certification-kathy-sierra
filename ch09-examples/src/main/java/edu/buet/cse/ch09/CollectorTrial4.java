package edu.buet.cse.ch09;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Various examples of usage of Collector
 * 
 * @author shamim
 *
 */
public class CollectorTrial4 {
  public static void main(String... args) {
    Person person1 = new Person("Alice", 21);
    Person person2 = new Person("Bob", 35);
    Person person3 = new Person("Christie", 21);
    Person person4 = new Person("Alice", 35);
    Person person5 = new Person("Bob", 45);
    Person person6 = new Person("Christie", 45);

    List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5, person6);

    // group persons by name
    Map<String, List<Person>> groupByNameMap =
        personList.stream().collect(Collectors.groupingBy(Person::getName));
    groupByNameMap.entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    System.out.println();

    // group persons by age
    Map<Integer, List<Person>> groupByAgeMap =
        personList.stream().collect(Collectors.groupingBy(Person::getAge));
    groupByAgeMap.entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    System.out.println();

    // compute the sum of everyone's age
    int sumOfAge = personList.stream().collect(Collectors.summingInt(Person::getAge));
    System.out.println("Sum of ages = " + sumOfAge);

    // compute the average age
    Double averageAge = personList.stream().collect(Collectors.averagingInt(Person::getAge));
    System.out.println("Average age : " + averageAge);
  }
}
