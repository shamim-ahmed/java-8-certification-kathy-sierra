package edu.buet.cse.ocpjp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteDirectoryTrial {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/empty-dir");

    if (!Files.exists(path)) {
      try {
        Files.createDirectory(path);
      } catch (IOException ex) {
        System.err.println(ex);
      }
    }

    System.out.printf("exists? %b%n", Files.exists(path));
    System.out.printf("is directory? %b%n", Files.isDirectory(path));
    System.out.printf("is sybmolic link? %b%n", Files.isSymbolicLink(path));

    try {
      boolean result = Files.deleteIfExists(path);

      if (result) {
        System.out.printf("%s has been deleted successfully", path.toString());
      }
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
