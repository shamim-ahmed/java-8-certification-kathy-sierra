package edu.buet.cse.ocpjp;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIncrementTrial {
  public static void main(String... args) {
    AtomicInteger counter = new AtomicInteger(1);
    int x = counter.incrementAndGet();
    System.out.println(x);

    int y = counter.getAndIncrement();
    System.out.println(y);
    System.out.println(counter.get());

    int z = counter.addAndGet(1);
    System.out.println(z);
  }
}
