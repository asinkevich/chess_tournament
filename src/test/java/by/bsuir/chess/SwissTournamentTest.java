package by.bsuir.chess;

import by.bsuir.tournament.model.Participant;
import by.bsuir.tournament.model.Tour;
import by.bsuir.tournament.model.Tournament;
import by.bsuir.tournament.model.TournamentParticipant;
import by.bsuir.tournament.model.factory.TournamentFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class SwissTournamentTest {
  @Test
  public void testNumberOfTours() {
    Tournament tournament = TournamentFactory.createSwissTournament(getListOfParticipantsWithCount(8), 4);
    assertEquals(4, tournament.getTours().size());
    tournament = TournamentFactory.createSwissTournament(getListOfParticipantsWithCount(16), 4);
    assertEquals(5, tournament.getTours().size());
  }

  private List<Participant> getListOfParticipantsWithCount(int participantsCount) {
    List<Participant> participants = new ArrayList<Participant>(participantsCount);
    for (int i = 0; i < participantsCount; i++) {
      participants.add(new Participant());
    }
    return participants;
  }

  @Test
  public void idlePlayerShouldGetWinInFirstTour() {
    for (int i = 9; i < 1000; i = i * 2 + 1) {
      Tournament tournament = TournamentFactory.createSwissTournament(getListOfParticipantsWithCount(i), 4);
      int numOfWinnersInFirstTour = 0;
      TournamentParticipant winnerInFirstTour = null;
      for (TournamentParticipant player : tournament.getParticipants()) {
        if (player.getScore() > 0) {
          numOfWinnersInFirstTour++;
          winnerInFirstTour = player;
        }
      }
      assertEquals(numOfWinnersInFirstTour, 1);
      assertNotNull(winnerInFirstTour);
      assertEquals(winnerInFirstTour.getScore(), 1);
    }
  }

  @Test
  public void allPlayersShouldHaveOneGameInFirstTour() {
    for (int numOfPlayers = 8; numOfPlayers < 100; numOfPlayers++) {
      Tournament tournament = TournamentFactory.createSwissTournament(getListOfParticipantsWithCount(numOfPlayers), 4);
      Tour firstTour = tournament.getTours().get(0);
      int partiesInFirstTour = firstTour.getParties().size();
      assertEquals(partiesInFirstTour, numOfPlayers / 2);
    }
  }

  @Test
  public void toursShouldBeOrderedByTheirIndex() {
    int numOfPlayers = 256;
    Tournament tournament = TournamentFactory.createSwissTournament(getListOfParticipantsWithCount(numOfPlayers), 4);
    for (int i = 0; i < tournament.getTours().size(); i++) {
      assertEquals(i, tournament.getTours().get(i).getIndex());
    }
  }

  @Test
  public void participantsShouldBeOrderedByTheirScore() {
    int numOfPlayers = 256;
    Tournament tournament = TournamentFactory.createSwissTournament(getListOfParticipantsWithCount(numOfPlayers), 4);
    Random random = new Random();
    for (TournamentParticipant participant : tournament.getParticipantsInternal()) {
      participant.setScore(random.nextInt());
    }
    TournamentParticipant prevParticipant = tournament.getParticipants().get(0);
    for (TournamentParticipant participant : tournament.getParticipants()) {
      int currentScore = participant.getScore();
      int prevScore = prevParticipant.getScore();
      boolean condition = prevScore >= currentScore;
      assertTrue(condition);
      prevParticipant = participant;
    }
  }
}
