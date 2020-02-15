package edu.buet.cse.ocpjp;

import java.io.File;
import java.nio.file.Path;

public class RootDirectoriesTrial2 {
  public static void main(String... args) {
    File[] roots = File.listRoots();

    for (File f : roots) {
      Path p = f.toPath();
      System.out.println(p);
    }
  }
}
