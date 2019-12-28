package edu.buet.cse.ocpjp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteSymbolicLinkTrial {
  public static void main(String... args) {
    Path link = Paths.get("/home/shamim/personal/temp/softlink");
    Path target = Paths.get("/home/shamim/personal/temp/copied-source");

    if (!Files.exists(link)) {
      try {
        Files.createSymbolicLink(link, target);
      } catch (IOException ex) {
        System.err.println(ex);
      }
    }

    System.out.printf("exists? %b%n", Files.exists(link));
    System.out.printf("is directory? %b%n", Files.isDirectory(link));
    System.out.printf("is directory (with NOFOLLOW_LINKS)? %b%n",
        Files.isDirectory(link, LinkOption.NOFOLLOW_LINKS));
    System.out.printf("is symbolic link? %b%n", Files.isSymbolicLink(link));

    try {
      boolean result = Files.deleteIfExists(link);

      if (result) {
        System.out.printf("%s has been deleted successfully", link.toString());
      }
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
