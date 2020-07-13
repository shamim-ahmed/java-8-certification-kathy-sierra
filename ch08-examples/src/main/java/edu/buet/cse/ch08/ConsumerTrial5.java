package edu.buet.cse.ch08;

import java.util.Map;

import edu.buet.cse.ch08.model.User;

public class ConsumerTrial5 {
  public static void main(String... args) {
    User user = new User();

    // example of lambda that produces side effects
    Map<String, String> envMap = System.getenv();
    envMap.forEach((k, v) -> {
      if (k.equalsIgnoreCase("USERNAME")) {
        user.setUserName(v);
      }
    });

    System.out.println(user.getUserName());
  }
}
