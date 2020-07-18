package edu.buet.cse.ch08;

@FunctionalInterface
public interface TriPredicate<T, U, V> {
  boolean test(T t, U u, V v);
}
