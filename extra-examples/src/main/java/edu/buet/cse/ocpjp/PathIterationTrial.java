package edu.buet.cse.ocpjp;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathIterationTrial {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/to-helen.txt");

    for (Path p : path) {
      System.out.println(p);
    }
  }
}
