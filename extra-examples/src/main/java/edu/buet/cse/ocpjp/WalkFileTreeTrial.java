package edu.buet.cse.ocpjp;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;

public class WalkFileTreeTrial {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/copied-source");

    try {
      Files.walkFileTree(path, Collections.emptySet(), 2, new CustomFileVisitor());
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }

  private static class CustomFileVisitor implements FileVisitor<Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path p, BasicFileAttributes a) {
      return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path p, BasicFileAttributes a) {
      System.out.println(p);
      return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
      return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
      return FileVisitResult.CONTINUE;
    }
  }
}
