package edu.buet.cse.ch09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Create a stream from a file
 * 
 * @author shamim
 */
public class CreateStreamTrial3 {
  private static final String FILE_PATH = "/home/shamim/personal/temp/poem.txt";

  public static void main(String... args) {
    try (Stream<String> stream = Files.lines(Paths.get(FILE_PATH))) {
      stream.map(line -> line.toUpperCase()).forEach(System.out::println);
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
