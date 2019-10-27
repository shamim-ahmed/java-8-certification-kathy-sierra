package edu.buet.cse.ch09;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Create a stream from a file
 * 
 * @author shamim
 */
public class StreamFromFileTrial {
  private static final String RESOURCE_PATH = "/edu/buet/cse/ch09/poem.txt";

  public static void main(String... args) {
    StreamFromFileTrial trial = new StreamFromFileTrial();
    trial.readLines();
  }

  public void readLines() {
    URL resourceUrl = getClass().getResource(RESOURCE_PATH);

    try (Stream<String> stream = Files.lines(Paths.get(resourceUrl.toURI()))) {
      stream.map(line -> line.toUpperCase()).forEach(System.out::println);
    } catch (IOException | URISyntaxException ex) {
      System.err.println(ex);
    }
  }
}
