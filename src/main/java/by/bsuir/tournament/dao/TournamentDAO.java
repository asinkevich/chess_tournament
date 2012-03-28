package by.bsuir.tournament.dao;

import by.bsuir.tournament.model.NewsArticle;
import by.bsuir.tournament.model.Participant;
import by.bsuir.tournament.model.Tour;
import by.bsuir.tournament.model.Tournament;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

public interface TournamentDAO {
  Collection<NewsArticle> findNews() throws DataAccessException;

  Collection<Tournament> findTournaments();

  Tournament loadTournament(int id);

  Tour loadTour(int id);
}
