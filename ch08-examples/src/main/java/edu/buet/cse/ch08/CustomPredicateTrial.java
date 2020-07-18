package edu.buet.cse.ch08;

import java.util.Arrays;
import java.util.List;

import edu.buet.cse.ch08.model.TextBook;

public class CustomPredicateTrial {
  public static void main(String... args) {
    TriPredicate<String, Double, Integer> bookSelector = (name, price, year) -> {
      return name.toLowerCase().contains("java") && price <= 50.0 && year >= 2015;
    };

    TextBook book1 = new TextBook("Java 8 in Action", 40.0, 2018);
    TextBook book2 = new TextBook("Python in Action", 40.0, 2017);
    TextBook book3 = new TextBook("Beginning Java 8", 30.0, 2014);
    List<TextBook> bookList = Arrays.asList(book1, book2, book3);

    bookList.stream().filter(b -> bookSelector.test(b.getName(), b.getPrice(), b.getYear()))
        .forEach(System.out::println);
  }
}
