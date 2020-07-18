package edu.buet.cse.ch08;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTrial {
  public static void main(String...args) {
    List<String> nameList = Arrays.asList("Firefox", "Chrome", "Edge");
    
    // print names using an instance method reference
    nameList.forEach(System.out::println);
    
    System.out.println();
    
    // print names using a static method reference
    nameList.forEach(MethodReferenceTrial::printInUpperCase);
  }
  
  private static void printInUpperCase(String name) {
    System.out.println(name.toUpperCase());
  }
}
