package by.bsuir.tournament.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.samples.petclinic.BaseEntity;

public class Party extends BaseEntity {
  private Participant firstPlayer;
  private Participant secondPlayer;
  private int firstPlayerScore;
  private int secondPlayerScore;

  public Participant getFirstPlayer() {
    return firstPlayer;
  }

  public void setFirstPlayer(Participant firstPlayer) {
    this.firstPlayer = firstPlayer;
  }

  public Participant getSecondPlayer() {
    return secondPlayer;
  }

  public void setSecondPlayer(Participant secondPlayer) {
    this.secondPlayer = secondPlayer;
  }

  public int getFirstPlayerScore() {
    return firstPlayerScore;
  }

  public void setFirstPlayerScore(int firstPlayerScore) {
    this.firstPlayerScore = firstPlayerScore;
  }

  public int getSecondPlayerScore() {
    return secondPlayerScore;
  }

  public void setSecondPlayerScore(int secondPlayerScore) {
    this.secondPlayerScore = secondPlayerScore;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
        .append("id", getId())
        .append("firstPlayer", getFirstPlayer().getLastName())
        .append("secondPlayer", getSecondPlayer().getLastName())
        .append("score", getFirstPlayerScore() + "-" + getSecondPlayerScore())
        .toString();
  }
}
