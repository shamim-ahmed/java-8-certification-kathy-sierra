package edu.buet.cse.ocpjp;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AbsolutePathTrial {
  public static void main(String...args) {
    Path path = Paths.get("to-helen.txt");
    Path absolutePath = path.toAbsolutePath();
    System.out.println(absolutePath);
  }
}
