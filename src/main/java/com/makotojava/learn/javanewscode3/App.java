package com.makotojava.learn.javanewscode3;

/**
 * Hello world!
 *
 */
public class App {
  /**
   * Computes the sum of the specified operands.
   * 
   * @param operands
   *          These are the operands. It's sort of there in the name.
   * 
   * @return long - The computed sum.
   * 
   * @throws IllegalArgumentException
   *           If the specified array of operands is empty or long.
   *           This is definitely an overreaction, but this is sample
   *           code, son.
   */
  public long add(long[] operands) {
    if (operands == null) {
      throw new IllegalArgumentException("Operands argument cannot be null");
    }
    if (operands.length == 0) {
      throw new IllegalArgumentException("Operands argument cannot be empty");
    }
    // Compute the sum
    long ret = 0;
    for (long operand : operands) {
      ret += operand;
    }
    return ret;
  }
}
