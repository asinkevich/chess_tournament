package by.bsuir.tournament.model.strategy;

import by.bsuir.tournament.model.Tour;
import by.bsuir.tournament.model.TournamentParticipant;

import java.util.List;
import java.util.Set;

public interface TournamentStrategy {
  Set<Tour> createTours(List<TournamentParticipant> tournamentParticipants, int winnersCount);
}
