package edu.buet.cse.ocpjp;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AbsolutePathTrial2 {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/temp/to-helen.txt");
    Path subPath = path.subpath(1, 3);
    Path absolutePath = subPath.getName(1).toAbsolutePath();
    System.out.println(absolutePath);
  }
}
