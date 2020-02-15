package edu.buet.cse.ocpjp;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class RootDirectoriesTrial {
  public static void main(String... args) {
    Iterable<Path> roots = FileSystems.getDefault().getRootDirectories();

    for (Path p : roots) {
      System.out.println(p);
    }
  }
}
