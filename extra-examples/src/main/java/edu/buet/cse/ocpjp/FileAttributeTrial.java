package edu.buet.cse.ocpjp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileAttributeTrial {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/to-helen.txt");

    try {
      BasicFileAttributes basicAttributes = Files.readAttributes(path, BasicFileAttributes.class);
      System.out.printf("is directory? %b%n", basicAttributes.isDirectory());
      System.out.printf("is regular file? %b%n", basicAttributes.isRegularFile());
      System.out.printf("size = %d%n", basicAttributes.size());
      System.out.printf("creation time = %s%n", basicAttributes.creationTime());
      System.out.printf("last access time = %s%n", basicAttributes.lastAccessTime());
      System.out.printf("last modified time = %s%n", basicAttributes.lastModifiedTime());
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
