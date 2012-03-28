package by.bsuir.tournament.model.factory;

import by.bsuir.tournament.model.Participant;
import by.bsuir.tournament.model.Tour;
import by.bsuir.tournament.model.Tournament;
import by.bsuir.tournament.model.TournamentParticipant;
import by.bsuir.tournament.model.strategy.SwissTournamentStrategy;
import by.bsuir.tournament.model.strategy.TournamentStrategy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TournamentFactory {
  public static Tournament createSwissTournament(List<Participant> participants, int winnersCount) {
    Set<TournamentParticipant> tournamentParticipants = new HashSet<TournamentParticipant>(participants.size());
    for (Participant participant : participants) {
      tournamentParticipants.add(new TournamentParticipant(participant, 0));
    }
    Tournament tournament = new Tournament();
    tournament.setParticipantsInternal(tournamentParticipants);

    TournamentStrategy strategy = new SwissTournamentStrategy();
    Set<Tour> tours = strategy.createTours(tournament.getParticipants(), winnersCount);
    tournament.setToursInternal(tours);
    return tournament;
  }
}
