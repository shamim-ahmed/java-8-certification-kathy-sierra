package edu.buet.cse.ch09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamTrial2 {
  public static void main(String... args) {
    List<Integer> valueList = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
    
    // addition is commutative, so parallelization will have no adverse impact
    // note how we implement sum operation for Stream<Integer> 
    int sum = valueList.parallelStream().collect(Collectors.summingInt(n -> n.intValue()));
    System.out.println(sum);
  }
}
