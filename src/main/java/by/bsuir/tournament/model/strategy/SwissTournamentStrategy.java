package by.bsuir.tournament.model.strategy;

import by.bsuir.tournament.model.Party;
import by.bsuir.tournament.model.Tour;
import by.bsuir.tournament.model.TournamentParticipant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SwissTournamentStrategy implements TournamentStrategy {
  @Override
  public Set<Tour> createTours(List<TournamentParticipant> players, int winnersCount) {
    int numOfTours = getNumOfTours(players.size(), winnersCount);
    List<Tour> tours = new ArrayList<Tour>(numOfTours);
    tours.add(0, createFirstTour(players));
    for (int i = 1; i < numOfTours; i++) {
      Tour tour = new Tour();
      tour.setIndex(i);
      tours.add(tour);
    }
    return new HashSet<Tour>(tours);
  }

  private int getNumOfTours(int participantsCount, int winnersCount) {
    double numOfTours = Math.log(participantsCount) / Math.log(2);
    if (winnersCount > 1) {
      numOfTours += Math.log(winnersCount - 1) / Math.log(2);
    }
    return (int) numOfTours;
  }

  private Tour createFirstTour(List<TournamentParticipant> players) {
    Tour firstTour = new Tour();
    firstTour.setIndex(0);
    for (int i = 0; i < players.size() - 1; i += 2) {
      Party party = new Party();
      party.setFirstPlayer(players.get(i));
      party.setSecondPlayer(players.get(i + 1));
      party.setFirstPlayerScore(0);
      party.setSecondPlayerScore(0);

      firstTour.addParty(party);
    }
    if (players.size() % 2 == 1) {
      players.get(players.size() - 1).setScore(1);
    }
    return firstTour;
  }
}
