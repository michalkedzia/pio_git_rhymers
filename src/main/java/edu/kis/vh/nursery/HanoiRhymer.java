package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

  int totalRejected = 0;

  public int reportRejected() {
    return totalRejected;
  }

  public void countIn(int in) {
    if (!callCheck() && in > peekaboo()) totalRejected++;
    else super.countIn(in);
  }
}
// kombinacja klawiszy alt + ← oraz alt + → słuzy do przechodzenia pomiędzy otwartymi plikami
