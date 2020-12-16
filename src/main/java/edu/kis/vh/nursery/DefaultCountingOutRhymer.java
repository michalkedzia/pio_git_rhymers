package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

  private static final int ERROR = -1;
  private static final int SIZE = 12;
  private final int[] numbers = new int[SIZE];

  private int total = ERROR;

  protected void countIn(int in) {
    if (!isFull()) numbers[++total] = in;
  }

  protected boolean callCheck() {
    return total == ERROR;
  }

  protected boolean isFull() {
    return total == SIZE - 1;
  }

  protected int peekaboo() {
    if (callCheck()) return ERROR;
    return numbers[total];
  }

  protected int countOut() {
    if (callCheck()) return ERROR;
    return numbers[total--];
  }

  public int getTotal() {
    return total;
  }
}
