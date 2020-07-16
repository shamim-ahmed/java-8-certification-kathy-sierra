package edu.buet.cse.ch08;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

import edu.buet.cse.ch08.model.Book;

public class BiPredicateTrial {
  public static void main(String... args) {
    BiPredicate<String, Double> javaBuy = (name, price) -> name.toLowerCase().contains("java");
    BiPredicate<String, Double> priceBuy = (name, price) -> price < 55.0;
    BiPredicate<String, Double> definiteBuy = javaBuy.and(priceBuy);

    Book book1 = new Book("Java 8 in Action", 40.0);
    Book book2 = new Book("Python in Action", 40.0);
    Book book3 = new Book("Beginning Java 8", 100.0);
    List<Book> bookList = Arrays.asList(book1, book2, book3);

    bookList.stream().filter(b -> definiteBuy.test(b.getName(), b.getPrice()))
        .forEach(System.out::println);
  }
}
