package edu.buet.cse.ch09;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DvdInfoParser {
  private static final String SEPARATOR = "\\|";

  public static void main(String... args) {
    URL resourceUrl = DvdInfoParser.class.getResource("/edu/buet/cse/ch09/DvdData.txt");
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
