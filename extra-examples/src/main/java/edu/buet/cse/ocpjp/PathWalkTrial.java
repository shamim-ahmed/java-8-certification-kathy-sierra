package edu.buet.cse.ocpjp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PathWalkTrial {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/copied-source");

    try (Stream<Path> pathStream = Files.walk(path)) {
      pathStream.map(p -> p.toAbsolutePath()).forEach(System.out::println);
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
