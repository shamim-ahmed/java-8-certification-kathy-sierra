package edu.buet.cse.ocpjp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FindTrial {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/copied-source");

    try (Stream<Path> pathStream = Files.find(path, 2, (p, a) -> a.isRegularFile())) {
      pathStream.forEach(System.out::println);
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
