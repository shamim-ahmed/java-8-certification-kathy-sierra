package edu.buet.cse.ocpjp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;
import java.util.stream.Collectors;

public class PosixFileAttributeTrial {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/to-helen.txt");

    try {
      PosixFileAttributes posixAttributes = Files.readAttributes(path, PosixFileAttributes.class);
      System.out.printf("size = %d%n", posixAttributes.size());
      System.out.printf("creation time = %s%n", posixAttributes.creationTime());
      System.out.printf("last access time = %s%n", posixAttributes.lastAccessTime());
      System.out.printf("last modified time = %s%n", posixAttributes.lastModifiedTime());

      // Unix specific attributes
      UserPrincipal owner = posixAttributes.owner();
      System.out.printf("owner = %s%n", owner.getName());
      GroupPrincipal group = posixAttributes.group();
      System.out.printf("group = %s%n", group.getName());

      System.out.print("Permissions: ");
      Set<PosixFilePermission> permissions = posixAttributes.permissions();
      String permStr = permissions.stream().map(p -> p.toString()).collect(Collectors.joining(","));
      System.out.println(permStr);
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
