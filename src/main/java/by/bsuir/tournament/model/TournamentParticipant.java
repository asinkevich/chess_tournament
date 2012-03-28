package by.bsuir.tournament.model;

import org.springframework.samples.petclinic.BaseEntity;

public class TournamentParticipant extends BaseEntity {
  private Participant participant;
  private int score;

  public TournamentParticipant() {
  }

  public TournamentParticipant(Participant participant, int score) {
    this.participant = participant;
    this.score = score;
  }

  public Participant getParticipant() {
    return participant;
  }

  public void setParticipant(Participant participant) {
    this.participant = participant;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void addPoints(int points) {
    this.score += points;
  }
}
