package edu.buet.cse.ch09;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import edu.buet.cse.ch09.model.DvdInfo;

/**
 * Parse dvd info in resource file, convert them to DvdInfo objects and collect them in a List
 * 
 * @author shamim
 *
 */
public class DvdInfoParser {
  private static final String RESOURCE_PATH = "/edu/buet/cse/ch09/DvdData.txt";
  private static final String SEPARATOR = "\\|";

  public static void main(String... args) {
    URL resourceUrl = DvdInfoParser.class.getResource(RESOURCE_PATH);
    List<DvdInfo> dvdList = new ArrayList<>();

    try (Stream<String> stream = Files.lines(Paths.get(resourceUrl.toURI()))) {
      stream.forEach(line -> {
        String[] values = line.split(SEPARATOR);
        DvdInfo dvd = new DvdInfo(values[0], values[1], values[2]);
        dvdList.add(dvd);
      });
    } catch (IOException | URISyntaxException ex) {
      System.err.println(ex);
    }

    dvdList.forEach(System.out::println);
  }
}
