package by.bsuir.tournament.dao.hibernate;

import by.bsuir.tournament.dao.TournamentDAO;
import by.bsuir.tournament.model.NewsArticle;
import by.bsuir.tournament.model.Participant;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public class HibernateTournamentDAO implements TournamentDAO {
  private SessionFactory sessionFactory;

  @Autowired
  public HibernateTournamentDAO(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  @Override
  @Transactional(readOnly = true)
  @SuppressWarnings("unchecked")
  public Collection<NewsArticle> findNews() throws DataAccessException {
    return sessionFactory.getCurrentSession().createQuery("from NewsArticle newsArticle").list();
  }
}
