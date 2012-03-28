package by.bsuir.tournament.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.samples.petclinic.BaseEntity;

public class Party extends BaseEntity {
  private TournamentParticipant firstPlayer;
  private TournamentParticipant secondPlayer;
  private int firstPlayerScore;
  private int secondPlayerScore;

  public TournamentParticipant getFirstPlayer() {
    return firstPlayer;
  }

  public void setFirstPlayer(TournamentParticipant firstPlayer) {
    this.firstPlayer = firstPlayer;
  }

  public TournamentParticipant getSecondPlayer() {
    return secondPlayer;
  }

  public void setSecondPlayer(TournamentParticipant secondPlayer) {
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
        .append("firstPlayer", getFirstPlayer().getParticipant().getLastName())
        .append("secondPlayer", getSecondPlayer().getParticipant().getLastName())
        .append("score", getFirstPlayerScore() + "-" + getSecondPlayerScore())
        .toString();
  }
}
