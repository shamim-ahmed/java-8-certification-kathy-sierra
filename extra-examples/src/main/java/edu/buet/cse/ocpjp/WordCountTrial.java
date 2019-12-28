package edu.buet.cse.ocpjp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class WordCountTrial {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/to-helen.txt");

    try (Stream<String> lineStream = Files.lines(path)) {
      long n = lineStream.parallel().flatMap(s -> Stream.of(s.split("\\s+")))
          .filter(w -> w.trim().length() > 0).count();
      System.out.printf("Number of words: %d%n", n);
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
