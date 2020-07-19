package edu.buet.cse.ch09;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import edu.buet.cse.ch09.model.DvdInfo;

/**
 * Demonstrate a better way to collect DvdInfo objects in a List
 * 
 * @author shamim
 *
 */
public class DvdInfoParser2 {
  private static final String RESOURCE_PATH = "/edu/buet/cse/ch09/DvdData.txt";
  private static final String SEPARATOR = "\\|";

  public static void main(String... args) {
    DvdInfoParser2 parser = new DvdInfoParser2();
    List<DvdInfo> dvdList = Collections.emptyList();

    try {
      dvdList = parser.parseDvdInfo();
    } catch (IOException | URISyntaxException ex) {
      System.err.println(ex);
    }

    dvdList.forEach(System.out::println);
  }

  public List<DvdInfo> parseDvdInfo() throws IOException, URISyntaxException {
    URL resourceUrl = getClass().getResource(RESOURCE_PATH);

    try (Stream<String> stream = Files.lines(Paths.get(resourceUrl.toURI()))) {
      return stream.map(line -> {
        String[] tokens = line.split(SEPARATOR);
        return new DvdInfo(tokens[0], tokens[1], tokens[2]);
      }).collect(Collectors.toList());
    }
  }
}
