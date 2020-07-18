package edu.buet.cse.ch08;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorTrial {
  public static void main(String... args) {
    UnaryOperator<Double> log2 = d -> Math.log(d) / Math.log(2);
    System.out.println(log2.apply(8.0));

    BinaryOperator<Double> power = (x, n) -> Math.pow(x, n);
    System.out.println(power.apply(2.0, 3.0));
  }
}
