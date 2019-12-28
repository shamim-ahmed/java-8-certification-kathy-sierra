package edu.buet.cse.ocpjp;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathNormalizeTrial {
  public static void main(String... args) {
    Path path = Paths.get(".").normalize();
    System.out.println(path.getNameCount());
  }
}
