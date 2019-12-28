package edu.buet.cse.ocpjp;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTrial {
  public static void main(String... args) {
    CyclicBarrier cb =
        new CyclicBarrier(3, () -> System.out.println("done: " + Thread.currentThread().getName()));

    // submit tasks to executor
    ExecutorService executor = Executors.newFixedThreadPool(5);
    executor.submit(new MyRunnable(cb));
    executor.submit(new MyRunnable(cb));
    
    // main thread starts waiting
    System.out.println("Waiting: " + Thread.currentThread().getName());

    try {
      cb.await();
    } catch (InterruptedException | BrokenBarrierException ex) {
      System.err.println(ex);
    }
    
    executor.shutdown();
  }

  private static class MyRunnable implements Runnable {
    private final CyclicBarrier barrier;

    public MyRunnable(CyclicBarrier barrier) {
      this.barrier = barrier;
    }

    public void run() {
      System.out.println("Waiting: " + Thread.currentThread().getName());

      try {
        barrier.await();
      } catch (InterruptedException | BrokenBarrierException ex) {
        System.err.println(ex);
      }
    }
  }
}
