package by.bsuir.tournament.dao;

import by.bsuir.tournament.model.NewsArticle;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

public interface TournamentDAO {
  Collection<NewsArticle> findNews() throws DataAccessException;
}
