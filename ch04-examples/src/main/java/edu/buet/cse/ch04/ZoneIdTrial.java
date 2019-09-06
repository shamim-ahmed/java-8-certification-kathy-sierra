package edu.buet.cse.ch04;

import java.util.ArrayList;
import java.util.List;
import java.time.ZoneId;
import java.util.Set;

public class ZoneIdTrial {
  public static void main(String... args) {
    Set<String> zoneIdSet = ZoneId.getAvailableZoneIds();
    List<String> zoneIdList = new ArrayList<>(zoneIdSet);

    for (String zoneId : zoneIdList) {
      if (zoneId.contains("Australia")) {
        System.out.println(zoneId);
      }
    }
  }
}
