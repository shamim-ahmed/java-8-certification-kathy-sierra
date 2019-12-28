package edu.buet.cse.ocpjp;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

public class ForkJoinPoolTrial {
  public static void main(String... args) {
    int[] input = IntStream.rangeClosed(1, 2000).toArray();
    CustomRecursiveTask task = new CustomRecursiveTask(input, 0, input.length - 1);
    ForkJoinPool pool = new ForkJoinPool();

    try {
      Integer sum = pool.submit(task).get();
      System.out.printf("sum = %d%n", sum);
    } catch (InterruptedException | ExecutionException ex) {
      System.err.println(ex);
    } finally {
      pool.shutdown();
    }
  }

  private static class CustomRecursiveTask extends RecursiveTask<Integer> {
    private static final long serialVersionUID = 1L;
    private static final int THRESHOLD = 10;

    private final int[] values;
    private final int from;
    private final int to;

    public CustomRecursiveTask(int[] values, int from, int to) {
      this.values = values;
      this.from = from;
      this.to = to;
    }

    @Override
    public Integer compute() {
      int sum = 0;

      if ((to - from) <= THRESHOLD) {
        for (int i = from; i <= to; i++) {
          sum += values[i];
        }
      } else {
        int mid = from + (to - from) / 2;
        CustomRecursiveTask task1 = new CustomRecursiveTask(values, from, mid);
        CustomRecursiveTask task2 = new CustomRecursiveTask(values, mid + 1, to);

        task1.fork();
        int x = task2.compute();
        int y = task1.join();

        sum = x + y;
      }

      return sum;
    }
  }
}
